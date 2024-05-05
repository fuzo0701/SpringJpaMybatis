package com.oppo.demo;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JasyptTest {

    @Test
    public void jasyptTest(){
        String value = "!@qwe";
        String result = jasyptEncoding(value);
        log.info("---{}---", result);

    }
    

    public String jasyptEncoding(String value) {
        String key = "a7743f306954092411116c2a9f229abda9c7202558aca5a807b7814f7f55a4c7";
        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWITHMD5ANDDES");
        pbeEnc.setPassword(key);
        return pbeEnc.encrypt(value);
    }
}
