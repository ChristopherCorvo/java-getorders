package com.lambdaschool.javaordersapp;

import com.github.javafaker.Faker;
import com.lambdaschool.javaordersapp.models.Agent;
import com.lambdaschool.javaordersapp.models.Customers;
import com.lambdaschool.javaordersapp.models.Orders;
import com.lambdaschool.javaordersapp.models.Payments;
import com.lambdaschool.javaordersapp.repositories.AgentsRepository;
import com.lambdaschool.javaordersapp.repositories.CustomersRepository;

import com.lambdaschool.javaordersapp.repositories.OrdersRepository;
import com.lambdaschool.javaordersapp.repositories.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.Set;

@Transactional
@Component
public class SeedData
    implements CommandLineRunner
{
    /**
     * Connects the customer table to this SeedData method
     */
    @Autowired
    private CustomersRepository custrepos;

    /**
     * Connects the agents table to this SeedData method
     */
    @Autowired
    private AgentsRepository agentrepos;

    /**
     * Connects the orders table to this SeedData method
     */
    @Autowired
    private OrdersRepository ordersrepos;

    /**
     * Connects the payment table to this SeedData method
     */
    @Autowired
    private PaymentsRepository paymentrepos;

    /**
     * A Random generator is needed to randomly generate faker data.
     */
    private Random random = new Random();

    /**
     * Generates test, seed data for our application
     * First a set of known data is seeded into our database.
     * Second a random set of data using Java Faker is seeded into our database.
     * Note this process does not remove data from the database. So if data exists in the database
     * prior to running this process, that data remains in the database.
     *
     * @param args The parameter is required by the parent interface but is not used in this process.
     */
    @Transactional
    @Override
    public void run(String[] args) throws
                                   Exception
    {
        Payments pay1 = new Payments("Cash");
        Payments pay2 = new Payments("Gift Card");
        Payments pay3 = new Payments("Credit Card");
        Payments pay4 = new Payments("Mobile Pay");

        pay1 = paymentrepos.save(pay1);
        pay2 = paymentrepos.save(pay2);
        pay3 = paymentrepos.save(pay3);
        pay4 = paymentrepos.save(pay4);

        Agent a01 = new Agent("Ramasundar",
            "Bangalore",
            0.15,
            "077-25814763",
            "");
        Agent a02 = new Agent("Alex",
            "London",
            0.13,
            "075-12458969",
            "");
        Agent a03 = new Agent("Alford",
            "New York",
            0.12,
            "044-25874365",
            "");
        Agent a04 = new Agent("Ravi",
            "Bangalore",
            0.15,
            "077-45625874",
            "");
        Agent a05 = new Agent("Santakumar",
            "Chennai",
            0.14,
            "007-22388644",
            "");
        Agent a06 = new Agent("Lucida",
            "San Jose",
            0.12,
            "044-52981425",
            "");
        Agent a07 = new Agent("Anderson",
            "Brisban",
            0.13,
            "045-21447739",
            "");
        Agent a08 = new Agent("Subbarao",
            "Bangalore",
            0.14,
            "077-12346674",
            "");
        Agent a09 = new Agent("Mukesh",
            "Mumbai",
            0.11,
            "029-12358964",
            "");
        Agent a10 = new Agent("McDen",
            "London",
            0.15,
            "078-22255588",
            "");
        Agent a11 = new Agent("Ivan",
            "Torento",
            0.15,
            "008-22544166",
            "");
        Agent a12 = new Agent("Benjamin",
            "Hampshair",
            0.11,
            "008-22536178",
            "");

        Customers c01 = new Customers("Holmes",
            "London",
            "London",
            "UK",
            "2",
            6000.00,
            5000.00,
            7000.00,
            4000.00,
            "BBBBBBB",
            a03);
        Customers c02 = new Customers("Micheal",
            "New York",
            "New York",
            "USA",
            "2",
            3000.00,
            5000.00,
            2000.00,
            6000.00,
            "CCCCCCC",
            a08);
        Customers c03 = new Customers("Albert",
            "New York",
            "New York",
            "USA",
            "3",
            5000.00,
            7000.00,
            6000.00,
            6000.00,
            "BBBBSBB",
            a08);
        Customers c04 = new Customers("Ravindran",
            "Bangalore",
            "Bangalore",
            "India",
            "2",
            5000.00,
            7000.00,
            4000.00,
            8000.00,
            "AVAVAVA",
            a11);
        Customers c05 = new Customers("Cook",
            "London",
            "London",
            "UK",
            "2",
            4000.00,
            9000.00,
            7000.00,
            6000.00,
            "FSDDSDF",
            a06);
        Customers c06 = new Customers("Stuart",
            "London",
            "London",
            "UK",
            "1",
            6000.00,
            8000.00,
            3000.00,
            11000.00,
            "GFSGERS",
            a03);
        Customers c07 = new Customers("Bolt",
            "New York",
            "New York",
            "USA",
            "3",
            5000.00,
            7000.00,
            9000.00,
            3000.00,
            "DDNRDRH",
            a08);
        Customers c08 = new Customers("Fleming",
            "Brisban",
            "Brisban",
            "Australia",
            "2",
            7000.00,
            7000.00,
            9000.00,
            5000.00,
            "NHBGVFC",
            a05);
        Customers c09 = new Customers("Jacks",
            "Brisban",
            "Brisban",
            "Australia",
            "1",
            7000.00,
            7000.00,
            7000.00,
            7000.00,
            "WERTGDF",
            a05);
        Customers c10 = new Customers("Yearannaidu",
            "Chennai",
            "Chennai",
            "India",
            "1",
            8000.00,
            7000.00,
            7000.00,
            8000.00,
            "ZZZZBFV",
            a10);
        Customers c11 = new Customers("Sasikant",
            "Mumbai",
            "Mumbai",
            "India",
            "1",
            7000.00,
            11000.00,
            7000.00,
            11000.00,
            "147-25896312",
            a02);
        Customers c12 = new Customers("Ramanathan",
            "Chennai",
            "Chennai",
            "India",
            "1",
            7000.00,
            11000.00,
            9000.00,
            9000.00,
            "GHRDWSD",
            a10);
        Customers c13 = new Customers("Avinash",
            "Mumbai",
            "Mumbai",
            "India",
            "2",
            7000.00,
            11000.00,
            9000.00,
            9000.00,
            "113-12345678",
            a02);
        Customers c14 = new Customers("Winston",
            "Brisban",
            "Brisban",
            "Australia",
            "1",
            5000.00,
            8000.00,
            7000.00,
            6000.00,
            "AAAAAAA",
            a05);
        Customers c15 = new Customers("Karl",
            "London",
            "London",
            "UK",
            "0",
            4000.00,
            6000.00,
            7000.00,
            3000.00,
            "AAAABAA",
            a06);
        Customers c16 = new Customers("Shilton",
            "Torento",
            "Torento",
            "Canada",
            "1",
            10000.00,
            7000.00,
            6000.00,
            11000.00,
            "DDDDDDD",
            a04);
        Customers c17 = new Customers("Charles",
            "Hampshair",
            "Hampshair",
            "UK",
            "3",
            6000.00,
            4000.00,
            5000.00,
            5000.00,
            "MMMMMMM",
            a09);
        Customers c18 = new Customers("Srinivas",
            "Bangalore",
            "Bangalore",
            "India",
            "2",
            8000.00,
            4000.00,
            3000.00,
            9000.00,
            "AAAAAAB",
            a07);
        Customers c19 = new Customers("Steven",
            "San Jose",
            "San Jose",
            "USA",
            "1",
            5000.00,
            7000.00,
            9000.00,
            3000.00,
            "KRFYGJK",
            a10);
        Customers c20 = new Customers("Karolina",
            "Torento",
            "Torento",
            "Canada",
            "1",
            7000.00,
            7000.00,
            9000.00,
            5000.00,
            "HJKORED",
            a04);
        Customers c21 = new Customers("Martin",
            "Torento",
            "Torento",
            "Canada",
            "2",
            8000.00,
            7000.00,
            7000.00,
            8000.00,
            "MJYURFD",
            a04);
        Customers c22 = new Customers("Ramesh",
            "Mumbai",
            "Mumbai",
            "India",
            "3",
            8000.00,
            7000.00,
            3000.00,
            12000.00,
            "Phone No",
            a02);
        Customers c23 = new Customers("Rangarappa",
            "Bangalore",
            "Bangalore",
            "India",
            "2",
            8000.00,
            11000.00,
            7000.00,
            12000.00,
            "AAAATGF",
            a01);
        Customers c24 = new Customers("Venkatpati",
            "Bangalore",
            "Bangalore",
            "India",
            "2",
            8000.00,
            11000.00,
            7000.00,
            12000.00,
            "JRTVFDD",
            a07);
        Customers c25 = new Customers("Sundariya",
            "Chennai",
            "Chennai",
            "India",
            "3",
            7000.00,
            11000.00,
            7000.00,
            11000.00,
            "PPHGRTS",
            a10);

        Orders o01 = new Orders(1000.00,
            600.00,
            c13,
            "SOD");
        o01.getPayments()
            .add(pay1);

        Orders o02 = new Orders(3000.00,
            500.00,
            c19,
            "SOD");
        o02.getPayments()
            .add(pay2);

        Orders o03 = new Orders(4500.00,
            900.00,
            c07,
            "SOD");
        o03.getPayments()
            .add(pay3);
        o03.getPayments()
            .add(pay2);

        Orders o04 = new Orders(2000.00,
            0.00,
            c16,
            "SOD");
        o04.getPayments()
            .add(pay4);

        Orders o05 = new Orders(4000.00,
            600.00,
            c22,
            "SOD");
        o05.getPayments()
            .add(pay2);

        Orders o06 = new Orders(2000.00,
            0.00,
            c12,
            "SOD");
        o06.getPayments()
            .add(pay3);

        Orders o07 = new Orders(3500.00,
            2000.00,
            c02,
            "SOD");
        o07.getPayments()
            .add(pay4);

        Orders o08 = new Orders(2500.00,
            400.00,
            c03,
            "SOD");
        o08.getPayments()
            .add(pay1);

        Orders o09 = new Orders(500.00,
            0.00,
            c23,
            "SOD");
        o09.getPayments()
            .add(pay3);

        Orders o10 = new Orders(4000.00,
            700.00,
            c07,
            "SOD");
        o10.getPayments()
            .add(pay4);

        Orders o11 = new Orders(1500.00,
            600.00,
            c08,
            "SOD");
        o11.getPayments()
            .add(pay2);

        Orders o12 = new Orders(2500.00,
            0.00,
            c25,
            "SOD");
        o12.getPayments()
            .add(pay1);

        agentrepos.save(a01);
        agentrepos.save(a02);
        agentrepos.save(a03);
        agentrepos.save(a04);
        agentrepos.save(a05);
        agentrepos.save(a06);
        agentrepos.save(a07);
        agentrepos.save(a08);
        agentrepos.save(a09);
        agentrepos.save(a10);
        agentrepos.save(a11);
        agentrepos.save(a12);

        custrepos.save(c01);
        custrepos.save(c02);
        custrepos.save(c03);
        custrepos.save(c04);
        custrepos.save(c05);
        custrepos.save(c06);
        custrepos.save(c07);
        custrepos.save(c08);
        custrepos.save(c09);
        custrepos.save(c10);
        custrepos.save(c11);
        custrepos.save(c12);
        custrepos.save(c13);
        custrepos.save(c14);
        custrepos.save(c15);
        custrepos.save(c16);
        custrepos.save(c17);
        custrepos.save(c18);
        custrepos.save(c19);
        custrepos.save(c20);
        custrepos.save(c21);
        custrepos.save(c22);
        custrepos.save(c23);
        custrepos.save(c24);
        custrepos.save(c25);

        ordersrepos.save(o01);
        ordersrepos.save(o02);
        ordersrepos.save(o03);
        ordersrepos.save(o04);
        ordersrepos.save(o05);
        ordersrepos.save(o06);
        ordersrepos.save(o07);
        ordersrepos.save(o08);
        ordersrepos.save(o09);
        ordersrepos.save(o10);
        ordersrepos.save(o11);
        ordersrepos.save(o12);

        //Begins the faker data

        Faker dataFaker = new Faker(new Locale("en-US"));
        Set<String> customerNames = new HashSet<>();
        for (int i = 0; i < 100; i++)
        {
            customerNames.add(dataFaker.name()
                .fullName());
        }

        for (String theName : customerNames)
        {
            String custcity = dataFaker.address()
                .city();
            String tempWorkingarea = dataFaker.address()
                .cityName();
            String tempCustcountry = dataFaker.address()
                .country();
            String tempGrade = dataFaker.country()
                .countryCode2();
            double tempOpeningamt = dataFaker.number()
                .randomDouble(2,
                    0,
                    10000);
            double tempReceiveamt = dataFaker.number()
                .randomDouble(2,
                    0,
                    10000);
            double tempPaymentamt = dataFaker.number()
                .randomDouble(2,
                    0,
                    10000);
            double tempOutstandingamt = dataFaker.number()
                .randomDouble(2,
                    0,
                    10000);
            String tempPhone = dataFaker.phoneNumber()
                .phoneNumber();

            Customers fakeCustomer = new Customers(theName,
                custcity,
                tempWorkingarea,
                tempCustcountry,
                tempGrade,
                tempOpeningamt,
                tempReceiveamt,
                tempPaymentamt,
                tempOutstandingamt,
                tempPhone,
                a10);

            int randomNumber = random.nextInt(10); // random number 0 through 9
            for (int i = 0; i < randomNumber; i++)
            {
                double tempGetOrdamount = dataFaker.number()
                    .randomDouble(2,
                        0,
                        10000);
                double tempGetAdvanceamount = dataFaker.number()
                    .randomDouble(2,
                        0,
                        10000);
                String tempGetOrderdescription = dataFaker.lorem()
                    .characters();

                Orders newOrder = new Orders(tempGetOrdamount,
                    tempGetAdvanceamount,
                    fakeCustomer,
                    tempGetOrderdescription);

                //                newOrder.getPayments().add(pay1);
                //                fakeCustomer.getOrders()
                //                        .add(newOrder);
            }

            // this actually saves the faker data.
            custrepos.save(fakeCustomer);
        }
    }
}

