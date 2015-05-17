package com.abuabdul.practice.mockito.application;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

/**
 * Created by abuabdul on 5/9/2015.
 */
public class FlipkartApplicationTest {

    @Test
    public void sampleTest(){
        assertThat(true, is(false));
    }

}