package edu.gatech.seclass.tipcalculatortrial00;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class TipCalculatorActivity extends AppCompatActivity {
    private EditText getCheckAmountView;
    private EditText getPartySizeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);

        getCheckAmountView = (EditText) findViewById(R.id.checkAmountValue);
        getPartySizeView = (EditText) findViewById(R.id.partySizeValue);

    }

    public void computeTip(View view) {

        if ((getPartySizeView.getText().length() == 0) && (getCheckAmountView.getText().length() == 0)) {
            reset();
            Toast.makeText(getApplicationContext(), "Party Size and Amount Value Both Empty!", Toast.LENGTH_LONG).show();

        } else if (getPartySizeView.getText().length() == 0) {
            reset();
            Toast.makeText(getApplicationContext(), "Party Size Empty!", Toast.LENGTH_LONG).show();

        } else if (getCheckAmountView.getText().length() == 0) {
            reset();
            Toast.makeText(getApplicationContext(), "Amount Value Empty!", Toast.LENGTH_LONG).show();

        } else {
            String amountValueString = getCheckAmountView.getText().toString();
            Float amountValueFloat = Float.valueOf(amountValueString);

            String partySizeString = getPartySizeView.getText().toString();
            int partySizeInteger = Integer.parseInt(partySizeString);

            letsDoCalculation(amountValueFloat, partySizeInteger);
        }
    }

    /* Performs calculation to get the tip and amount value at different percentage
     * @param amount value input by the user for the total amount value
     * @param partysize input by the user for size of the party
     *
     */
    public void letsDoCalculation(Float amountValue, int partySize) {
        if ((partySize == 0)) {
            reset();
            Toast.makeText(getApplicationContext(),
                    "Invalid Party size! Should be greater than 0!", Toast.LENGTH_LONG).show();

        } else {
            int Tip15p = (int) (Math.round((.15 * amountValue) / partySize));
            int Tip20p = (int) (Math.round((.20 * amountValue) / partySize));
            int Tip25p = (int) (Math.round((.25 * amountValue) / partySize));
            float amountDiv = amountValue / partySize;

            int amount15p = (int) (Math.round(((.15 * amountValue) / partySize) + amountDiv));
            int amount20p = (int) (Math.round(((.20 * amountValue) / partySize) + amountDiv));
            int amount25p = (int) (Math.round(((.25 * amountValue) / partySize) + amountDiv));
            displayFor15PTip(Tip15p);
            displayFor20PTip(Tip20p);
            displayFor25PTip(Tip25p);
            displayFor15PTotal(amount15p);
            displayFor20PTotal(amount20p);
            displayFor25PTotal(amount25p);
        }

    }

    // Methods to display calculated tip

    public void displayFor15PTip(int tip15) {
        TextView scoreView = (TextView) findViewById(R.id.fifteenPercentTipValue);
        scoreView.setText(String.valueOf(tip15));
    }

    public void displayFor20PTip(int tip20) {
        TextView scoreView = (TextView) findViewById(R.id.twentyPercentTipValue);
        scoreView.setText(String.valueOf(tip20));
    }

    public void displayFor25PTip(int tip25) {
        TextView scoreView = (TextView) findViewById(R.id.twentyfivePercentTipValue);
        scoreView.setText(String.valueOf(tip25));
    }

    // Methods to display split amount per person

    public void displayFor15PTotal(int total15) {
        TextView scoreView = (TextView) findViewById(R.id.fifteenPercentTotalValue);
        scoreView.setText(String.valueOf(total15));

    }

    public void displayFor20PTotal(int total20) {
        TextView scoreView = (TextView) findViewById(R.id.twentyPercentTotalValue);
        scoreView.setText(String.valueOf(total20));
    }

    public void displayFor25PTotal(int total25) {
        TextView scoreView = (TextView) findViewById(R.id.twentyfivePercentTotalValue);
        scoreView.setText(String.valueOf(total25));
    }

    /* Performs resets for all the tip and amount values
     * if the input is not valid
     */
    public void reset() {
        TextView scoreView15Tip = (TextView) findViewById(R.id.fifteenPercentTipValue);
        scoreView15Tip.setText("");

        TextView scoreView20Tip = (TextView) findViewById(R.id.twentyPercentTipValue);
        scoreView20Tip.setText("");

        TextView scoreView25Tip = (TextView) findViewById(R.id.twentyfivePercentTipValue);
        scoreView25Tip.setText("");

        TextView scoreView15Total = (TextView) findViewById(R.id.fifteenPercentTotalValue);
        scoreView15Total.setText("");

        TextView scoreView20Total = (TextView) findViewById(R.id.twentyPercentTotalValue);
        scoreView20Total.setText("");

        TextView scoreView25Total = (TextView) findViewById(R.id.twentyfivePercentTotalValue);
        scoreView25Total.setText("");

    }


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tip_calculator, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
}