package com.example.calculation_calculate;


public class Calculator {

}
   /* private void getResult() {
        String s = textView.getText().toString();
        if (s == null || s.equals("")) {
            return;
        }
        if (!s.contains("")) {
            return;
        }
        if (clear_flag) {
            clear_flag = false;
            return;
        }
        clear_flag = true;

        String str1 = s.substring(0, s.indexOf(""));
        String str_y = s.substring(s.indexOf("") + 1, s.indexOf("") + 2);
        String str2 = s.substring(s.indexOf("") + 3);

        double result = 0;
        if (!str1.equals("") && !str2.equals("")) {
            double num1 = Double.parseDouble(str1);
            double num2 = Double.parseDouble(str2);

           if (str_y.equals("+")) {
                result = num1 + num2;
            } else if (str_y.equals("-")) {
                result = num1 - num2;
            } else if (str_y.equals("÷")) {
                if (num2 == 0) {
                    result = 0;
                } else {
                    result = num1 / num2;
                }
            } else if (str_y.equals("*")) {
                result = num1 * num2;
            }
            if (!str1.contains(".") && !str2.contains(".") && !s.equals("÷")) {
                int k = (int) result;
                textView.setText(k);
            } else {
                textView.setText(result + "");
            }
        } else if (!str1.equals("") && str2.equals("")) {
            textView.setText(s);
        } else if (str1.equals("") && !str2.equals("")) {
            double num2 = Double.parseDouble(str2);
            if (s.equals("+")) {
                result = 0 + num2;
            } else if (s.equals("-")) {
                result = 0 - num2;
            } else if (s.equals("×")) {
                result = 0;
            } else if (s.equals("÷")) {
                result = 0;
            }
            if (!str2.contains(".")) {
                int r = (int) result;
                textView.setText(r + "");
            } else {
                textView.setText(result + "");
            }
        } else {
            textView.setText("");
        }
    }*/

