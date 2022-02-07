package vizcarra.leobardo.asignacion4_calculadoraimc_vizcarra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weight: EditText = findViewById(R.id.weight)
        val height: EditText = findViewById(R.id.height)
        val calculate: Button = findViewById(R.id.calculate)
        val imc: TextView = findViewById(R.id.imc)
        val range: TextView = findViewById(R.id.range)

        calculate.setOnClickListener {

            var peso = weight.toString().toDouble()
            var altura = height.toString().toDouble()

            var IMC = calcularImc(peso, altura)

            if (IMC > 40){

                imc.setText(IMC.toString())
                range.setText("Obesidad Grado 3")

            } else if (IMC > 35){

                imc.setText(IMC.toString())
                range.setText("Obesidad Grado 2")

            } else if (IMC > 30){

                imc.setText(IMC.toString())
                range.setText("Obesidad Grado 1")

            } else if (IMC > 25){

                imc.setText(IMC.toString())
                range.setText("Sobrepeso")

            } else if (IMC > 18.5){

                imc.setText(IMC.toString())
                range.setText("Normal")

            } else {
                imc.setText(IMC.toString())
                range.setText("Bajo peso")
            }

        }

    }

    private fun calcularImc(peso: Double, altura: Double): Double {
        return (peso / (altura * altura))
    }
}