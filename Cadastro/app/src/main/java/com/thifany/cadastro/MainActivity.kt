package com.thifany.cadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.content.Intent
import android.widget.*
import androidx.appcompat.app.AlertDialog
import android.graphics.Bitmap
import android.content.DialogInterface
import com.thifany.aula05.Pet

class MainActivity : AppCompatActivity() {

    private lateinit var foto: ImageView
    private lateinit var botaoTirarFoto : Button
    private lateinit var nome : EditText
    private lateinit var botaoSalvar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        foto = findViewById(R.id.imgFoto)
        botaoTirarFoto = findViewById(R.id.btnFoto)
        nome = findViewById(R.id.edtNome)
        botaoSalvar = findViewById(R.id.btnSalvar)

        botaoTirarFoto.setOnClickListener {
            abrirCamera()
        }

        botaoSalvar.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)

            val pet = Pet(nome = nome.text.toString())
            intent.putExtra("PET", pet)

            startActivity(intent)
        }
    }

    fun abrirCamera(){
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

        if(intent.resolveActivity(packageManager) != null){
            startActivityForResult(intent, 12345)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == 12345 && resultCode == RESULT_OK){
            val fotoTirada = data?.extras?.get("data") as Bitmap
            foto.setImageBitmap(fotoTirada)
        }
    }

    override fun onBackPressed() {
        var dialog = AlertDialog.Builder(this@MainActivity)
        dialog.setTitle("Confirmação")
        dialog.setPositiveButton("Sim", DialogInterface.OnClickListener{dialogInterface, i ->  super.onBackPressed()})
        dialog.create().show()
    }
}