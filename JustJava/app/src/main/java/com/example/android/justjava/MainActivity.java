package com.example.android.justjava;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Initial quantity of coffee
     */
    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        CheckBox whippedCreamCheckBox = (CheckBox)  findViewById(R.id.whipped_cream);
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();

        CheckBox chocolateCheckBox = (CheckBox)  findViewById(R.id.chocolate);
        boolean hasChocolate = chocolateCheckBox.isChecked();

        /**
         * For Allowing the person to enter his name
         */
        EditText person = (EditText) findViewById(R.id.person_name);
        Editable namePerson = person.getText();


        int price = calculatePrice(hasWhippedCream, hasChocolate);
        String priceMessage = createOrderSummary(price, hasWhippedCream, hasChocolate, namePerson);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "JustJava Order for " + namePerson);
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * Calculates the price of the order.
     *
     */
    private int calculatePrice(boolean priceOfWhippedCream, boolean priceOfChocolate) {
        int pricePerCup = 5;

        /**
         * Checks Whether coffee has whipped cream
         */
        if(priceOfWhippedCream) {
            pricePerCup += 1;
        }

        /**
         * Checks Whether coffee has Chocalate
         */
        if(priceOfChocolate){
            pricePerCup +=2;
        }

        return quantity * pricePerCup;
    }

    public String createOrderSummary(int price, boolean addWhippedCream, boolean addChocolate, Editable name) {
            Editable nameOfPerson = name;
            String whipCream = "Add Whipped Cream? " + addWhippedCream;
            String choco = "Add Chocolate? " + addChocolate;
            String priceMessage = "\nTotal: ₹" + price;
            priceMessage = "Name: " + nameOfPerson +"\n"+ whipCream + "\n"+ choco +"\nQuantity: " + quantity + priceMessage + "\nThank You!";
            return priceMessage;
    }

    /**
     * This method is called when plus button is clicked.
     */
    public void increment(View view) {
        if (quantity == 100) {
            Context context = getApplicationContext();
            CharSequence text = "You cannot order more than 100 cups of coffee!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * this method is called when minus button is clicked.
     */
    public void decrement(View view) {
        if (quantity == 1) {
            Context context = getApplicationContext();
            CharSequence text = "You cannot less than 1 cups of coffee!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

}
