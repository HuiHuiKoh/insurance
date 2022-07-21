package my.edu.tarc.insurance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.edu.tarc.insurance.databinding.ActivityMainBinding
import org.intellij.lang.annotations.RegExp
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    //TODO 2: Create an instance of View Binding
    private lateinit var binding: ActivityMainBinding
    //this binding variable is accessible for the whole project

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //TODO 3: Initialize view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        //inflate = load the layout into the memory and assign to binding

        setContentView(binding.root)
        //root = layout

        //TODO 4: Get input from the user
        binding.buttonCalculate.setOnClickListener {
            val age = binding.spinnerAge.selectedItemPosition //spinner = array
            val gender = binding.radioGroupGender.checkedRadioButtonId
            val smoker = binding.checkBoxSmoker.isChecked //return boolean
            var premium = 0 //it may change so using 'var'

            //when(age){ //'when' can be used during complex situation
            //    0 -> {

            //    }
            //    1 -> {

            //    }
            //}

            if (age == 0) {
                premium = 60
            } else if (age == 1) {
                premium = 70
                if (gender == binding.radioButtonMale.id) {
                    premium += 50
                }
                if (smoker) {
                    premium += 100
                }
            } else if (age == 2) {
                premium = 90
                if (gender == binding.radioButtonMale.id) {
                    premium += 100
                }
                if (smoker) {
                    premium += 150
                }
            } else if (age == 3) {
                premium = 120
                if (gender == binding.radioButtonMale.id) {
                    premium += 150
                }
                if (smoker) {
                    premium += 200
                }
            } else if (age == 4) {
                premium = 150
                if (gender == binding.radioButtonMale.id) {
                    premium += 200
                }
                if (smoker) {
                    premium += 250
                }
            } else if (age == 5) {
                premium = 150
                if (gender == binding.radioButtonMale.id) {
                    premium += 200
                }
                if (smoker) {
                    premium += 300
                }
            }

            val final_premium = NumberFormat.getCurrencyInstance().format(premium)
            binding.textViewPremium.text = final_premium
        }
        binding.buttonReset.setOnClickListener {
            
        }

    }
}