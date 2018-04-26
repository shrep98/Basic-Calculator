package com.basic.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Basic_CalculatorActivity extends Activity {

	Button bone, btwo, bthree, bfour, bfive, bsix, bseven, beight, bnine,
			bzero, badd, bsub, bmul, bdiv, bclear, bce, bequal;
	TextView txt;
	String s = "", s1 = "", s2 = "", s3 = "";
	int i = 0, i1 = 0, c = -1;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bone = (Button) findViewById(R.id.one);
		btwo = (Button) findViewById(R.id.two);
		bthree = (Button) findViewById(R.id.three);
		bfour = (Button) findViewById(R.id.four);
		bfive = (Button) findViewById(R.id.five);
		bsix = (Button) findViewById(R.id.six);
		bseven = (Button) findViewById(R.id.seven);
		beight = (Button) findViewById(R.id.eight);
		bnine = (Button) findViewById(R.id.nine);
		bzero = (Button) findViewById(R.id.zero);
		badd = (Button) findViewById(R.id.add);
		bsub = (Button) findViewById(R.id.sub);
		bmul = (Button) findViewById(R.id.mul);
		bdiv = (Button) findViewById(R.id.div);
		bclear = (Button) findViewById(R.id.clear);
		bce = (Button) findViewById(R.id.ce);
		bequal = (Button) findViewById(R.id.equal);

		txt = (TextView) findViewById(R.id.textView1);

		bone.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				s = (String) txt.getText();
				if (s.equals("+") || s.equals("-") || s.equals("/")
						|| s.equals("*")) {
					txt.setText("");
					s = "";
				}
				txt.setText(s + "1");
				s = "";
			}
		});

		btwo.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				s = (String) txt.getText();
				if (s.equals("+") || s.equals("-") || s.equals("/")
						|| s.equals("*")) {
					txt.setText("");
					s = "";
				}
				txt.setText(s + "2");
				s = "";
			}
		});

		bthree.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				s = (String) txt.getText();
				if (s.equals("+") || s.equals("-") || s.equals("/")
						|| s.equals("*")) {
					txt.setText("");
					s = "";
				}
				txt.setText(s + "3");
				s = "";
			}
		});

		bfour.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				s = (String) txt.getText();
				if (s.equals("+") || s.equals("-") || s.equals("/")
						|| s.equals("*")) {
					txt.setText("");
					s = "";
				}
				txt.setText(s + "4");
				s = "";
			}
		});

		bfive.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				s = (String) txt.getText();
				if (s.equals("+") || s.equals("-") || s.equals("/")
						|| s.equals("*")) {
					txt.setText("");
					s = "";
				}
				txt.setText(s + "5");
				s = "";
			}
		});

		bsix.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				s = (String) txt.getText();
				if (s.equals("+") || s.equals("-") || s.equals("/")
						|| s.equals("*")) {
					txt.setText("");
					s = "";
				}
				txt.setText(s + "6");
				s = "";
			}
		});

		bseven.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				s = (String) txt.getText();
				if (s.equals("+") || s.equals("-") || s.equals("/")
						|| s.equals("*")) {
					txt.setText("");
					s = "";
				}
				txt.setText(s + "7");
				s = "";
			}
		});

		beight.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				s = (String) txt.getText();
				if (s.equals("+") || s.equals("-") || s.equals("/")
						|| s.equals("*")) {
					txt.setText("");
					s = "";
				}
				txt.setText(s + "8");
				s = "";
			}
		});
		bnine.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				s = (String) txt.getText();
				if (s.equals("+") || s.equals("-") || s.equals("/")
						|| s.equals("*")) {
					txt.setText("");
					s = "";
				}
				txt.setText(s + "9");
				s = "";
			}
		});

		bzero.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				s = (String) txt.getText();
				if (s.equals("+") || s.equals("-") || s.equals("/")
						|| s.equals("*")) {
					txt.setText("");
					s = "";
				}
				txt.setText(s + "0");
				s = "";
			}
		});

		bclear.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				s = (String) txt.getText();
				if (s.equals("+") || s.equals("-") || s.equals("/")
						|| s.equals("*") || s.equals("")) {
					i = 0;
				} else {
					i = Integer.parseInt(s);
					i = i / 10;
				}
				if (i == 0) {
					txt.setText("");
				} else {
					txt.setText(i + "");
				}
				s = null;
			}
		});

		badd.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String tmp = (String) txt.getText();
				if (!tmp.equals("+") && !tmp.equals("-") && !tmp.equals("*")
						&& !tmp.equals("/"))
					s1 = tmp;
				c = 0;
				txt.setText("+");
			}

		});

		bsub.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String tmp = (String) txt.getText();
				if (!tmp.equals("+") && !tmp.equals("-") && !tmp.equals("*")
						&& !tmp.equals("/"))
					s1 = tmp;
				c = 1;
				txt.setText("-");
			}

		});

		bdiv.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String tmp = (String) txt.getText();
				if (!tmp.equals("+") && !tmp.equals("-") && !tmp.equals("*")
						&& !tmp.equals("/"))
					s1 = tmp;
				c = 2;
				txt.setText("/");
			}

		});

		bmul.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String tmp = (String) txt.getText();
				if (!tmp.equals("+") && !tmp.equals("-") && !tmp.equals("*")
						&& !tmp.equals("/"))
					s1 = tmp;
				c = 3;
				txt.setText("*");
			}

		});

		bce.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				txt.setText("");
				i = 0;
				i1 = 0;
				s1 = "";
				s2 = "";
				c = -1;
			}

		});

		bequal.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (s1 == "+" || s1 == "-" || s1 == "/" || s1 == "*") {
					i = 0;
				} else if (s1 == null || s1 == "" || s1.trim().length() == 0) {
					// i = i;
				} else {
					i = Integer.parseInt(s1);
				}

				s2 = (String) txt.getText();
				if (s2 == "+" || s2 == "-" || s2 == "/" || s2 == "*") {
					i1 = 0;
				} else if (s2 == null || s2 == "" || s2.trim().length() == 0) {
					i1 = 0;
				} else {
					i1 = Integer.parseInt(s2);
				}

				if (c == 0) {
					i = i + i1;
				} else if (c == 1) {
					i = i - i1;
				} else if (c == 2) {
					if (i1 == 0) {
						Toast.makeText(getApplicationContext(),
								"Invalid Input", Toast.LENGTH_LONG).show();
						i = 0;
					} else {
						i = i / i1;
					}
				} else if (c == 3) {
					i = i * i1;
				} else {
					i = 0;
				}
				txt.setText(i + "");
			}

		});
	}
}