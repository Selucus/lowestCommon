package org.example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LowestCommonTest {
    @Test
    public void testLowestCommon_1_1() {
        LowestCommon lowestCommon = new LowestCommon();
        int result = lowestCommon.lowestCommon(1, 1);
        assertThat(result, equalTo(0));
    };
    @Test
    public void testLowestCommon_1_0() {
        LowestCommon lowestCommon = new LowestCommon();
        int result = lowestCommon.lowestCommon(1, 0);
        assertThat(result, equalTo(-1));
    };
    @Test
    public void testLowestCommon_14_25() {
        LowestCommon lowestCommon = new LowestCommon();
        int result = lowestCommon.lowestCommon(14, 25);
        assertThat(result, equalTo(3));
    };
}