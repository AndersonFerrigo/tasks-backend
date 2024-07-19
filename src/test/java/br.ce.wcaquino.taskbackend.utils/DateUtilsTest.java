package br.ce.wcaquino.taskbackend.utils;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class DateUtilsTest {

    @Test
    public void deveRetornarTrueParaDataFuturas(){
        LocalDate localDate = LocalDate.of(2030, 01, 01);
        Assert.assertTrue(DateUtils.isEqualOrFutureDate(localDate));

    }

    @Test
    public void deveRetornarFalseParaDataPassadas(){
        LocalDate localDate = LocalDate.of(2010, 01, 01);
        Assert.assertFalse(DateUtils.isEqualOrFutureDate(localDate));
    }

    @Test
    public void deveRetornarTrueParaDataPresente(){
        LocalDate localDate = LocalDate.now();
        Assert.assertTrue(DateUtils.isEqualOrFutureDate(localDate));
    }
}
