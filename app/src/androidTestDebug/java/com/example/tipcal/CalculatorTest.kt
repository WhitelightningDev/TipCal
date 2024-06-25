package com.example.tipcal

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.whitelightning.tipcal.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.experimental.runners.Enclosed
import org.junit.runner.RunWith

@RunWith(Enclosed::class)
class CalculatorTest {
    @RunWith(AndroidJUnit4::class)
    class CalculatorTest{
        @get:Rule ()
        val activity =ActivityScenarioRule(MainActivity::class.java)

        @Test
        fun calculate_20_percent_tip() {

        }

    }
}