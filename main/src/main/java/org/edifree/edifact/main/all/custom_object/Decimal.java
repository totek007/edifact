package org.edifree.edifact.main.all.custom_object;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Decimal extends BigDecimal {

    private DecimalFormat decimalFormat;

    public Decimal(int val) {
        super(val);
    }

    public Decimal(String val){
        super(val);
    }

    public Decimal(BigDecimal val) {
        super(val.toString());
    }

    public Decimal(BigInteger val) {
        super(val);
    }

    public BigDecimal getValue() {
        return this;
    }

    public DecimalFormat getDecimalFormat() {
        return decimalFormat;
    }

    public Decimal setDecimalFormat(DecimalFormat decimalFormat) {
        this.decimalFormat = decimalFormat;
        return this;
    }

    public Decimal setDecimalFormatTwoDigitsWithDot(){
        DecimalFormat df=new DecimalFormat();
        df.setMinimumFractionDigits(2);
        df.setGroupingUsed(false);
        df.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.UK));
        setDecimalFormat(df);
        return this;
    }

    public Decimal setIntegerFormat(){
        DecimalFormat df=new DecimalFormat();
        df.setMaximumFractionDigits(0);
        df.setGroupingUsed(false);
        df.setRoundingMode(RoundingMode.DOWN);
        setDecimalFormat(df);
        return this;
    }

    @Override
    public String toString() {
        if(decimalFormat==null){
            return super.toString();
        }
        return decimalFormat.format(new BigDecimal(super.toString()));
    }

}
