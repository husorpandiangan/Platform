/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.PasienHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jboss.logging.Logger;
import pojos.Pasien;

/**
 *
 * @author basisa18
 */
public class TestPasienAddNew {

    public static void main(String[] args) throws ParseException {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            Date date = format.parse("19970813");
            String noRm = "115578";
            String nama = "Tongfeng";
            String alamat = "danau singkarak";
            String kelamin = "laki-laki";
            PasienHelper helper = new PasienHelper();
            helper.addNewPasien(noRm, nama, alamat, noRm, date, kelamin);
        } catch (ParseException ex) {

        }
    }
}
