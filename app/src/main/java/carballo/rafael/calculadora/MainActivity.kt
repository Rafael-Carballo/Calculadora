package carballo.rafael.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txArriba: TextView= findViewById(R.id.arriba)
        val txAbajo: TextView= findViewById(R.id.abajo)
        val txSim: TextView= findViewById(R.id.simbolo)
        val b1:Button=findViewById(R.id.b1)
        val b2:Button=findViewById(R.id.b2)
        val b3:Button=findViewById(R.id.b3)
        val b4:Button=findViewById(R.id.b4)
        val b5:Button=findViewById(R.id.b5)
        val b6:Button=findViewById(R.id.b6)
        val b7:Button=findViewById(R.id.b7)
        val b8:Button=findViewById(R.id.b8)
        val b9:Button=findViewById(R.id.b9)
        val b0:Button=findViewById(R.id.b0)
        val badd:Button=findViewById(R.id.badd)
        val bsus:Button=findViewById(R.id.bsus)
        val bdiv:Button=findViewById(R.id.bdiv)
        val btimes:Button=findViewById(R.id.btimes)
        val bc:Button=findViewById(R.id.bc)
        val bequal:Button=findViewById(R.id.bequals)
        var nuevo=true
        fun limpia(){
            txArriba.text=""
            txAbajo.text="0"
            txSim.text=""
        }
        fun cadena(numero:Int){
            var aux:String=txAbajo.text.toString()
            if(aux.equals("0")){
                aux=""
            }
            aux=aux+""+numero
            txAbajo.text = aux
            if(txSim.text==""){
                txArriba.text=""
            }
        }
        fun calcula(sim:String){
            if(txArriba.text==""){
                txArriba.text=txAbajo.text
                nuevo=false
            }else if (!nuevo){
            var aux:Int=txArriba.text.toString().toInt()
                var aux2:Int=txAbajo.text.toString().toInt()
                when(txSim.text) {
                    "+"->aux+=aux2
                    "-"->aux-=aux2
                    "*"->aux*=aux2
                    "/"->aux/=aux2
                }
                txArriba.text=""+aux
            }else
            if(nuevo){
                txArriba.text=""
            }
            txAbajo.text="0"
            txSim.text=sim
        }
        bc.setOnClickListener{
            limpia()
        }

        bequal.setOnClickListener{
            calcula("")
            nuevo=true
        }

        badd.setOnClickListener{
            calcula("+")

        }
        bsus.setOnClickListener{
            calcula("-")
        }
        bdiv.setOnClickListener{
            calcula("/")
        }
        btimes.setOnClickListener{
            calcula("*")
        }

        b1.setOnClickListener{
            cadena(1)
        }
        b2.setOnClickListener{
            cadena(2)
        }
        b3.setOnClickListener{
            cadena(3)
        }
        b4.setOnClickListener{
            cadena(4)
        }
        b5.setOnClickListener{
            cadena(5)
        }
        b6.setOnClickListener{
            cadena(6)
        }
        b7.setOnClickListener{
            cadena(7)
        }
        b8.setOnClickListener{
            cadena(8)
        }
        b9.setOnClickListener{
            cadena(9)
        }
        b0.setOnClickListener{
            cadena(0)
        }




    }
}