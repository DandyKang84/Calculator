package com.example.mycalculator

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.media.RingtoneManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.e
import android.widget.TextView
import android.widget.Toast
import com.example.mycalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var arithmetic = false
    var result: Double = 0.0
    var list = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val resultTextView: TextView by lazy {
            findViewById(R.id.edt_total)
        }

        binding.btnBotton1.setOnClickListener {
            binding.edtList.setText("${binding.edtList.text}1")
        }
        binding.btnBotton2.setOnClickListener {
            binding.edtList.setText("${binding.edtList.text}2")
        }
        binding.btnBotton3.setOnClickListener {
            binding.edtList.setText("${binding.edtList.text}3")
        }
        binding.btnBotton4.setOnClickListener {
            binding.edtList.setText("${binding.edtList.text}4")
        }
        binding.btnBotton5.setOnClickListener {
            binding.edtList.setText("${binding.edtList.text}5")
        }
        binding.btnBotton6.setOnClickListener {
            binding.edtList.setText("${binding.edtList.text}6")
        }
        binding.btnBotton7.setOnClickListener {
            binding.edtList.setText("${binding.edtList.text}7")
        }
        binding.btnBotton8.setOnClickListener {
            binding.edtList.setText("${binding.edtList.text}8")
        }
        binding.btnBotton9.setOnClickListener {
            binding.edtList.setText("${binding.edtList.text}9")
        }
        binding.btnButton0.setOnClickListener {
            binding.edtList.setText("${binding.edtList.text}0")
        }
        binding.btnPlus.setOnClickListener {
            binding.edtList.setText("${binding.edtList.text}+")
        }
        binding.btnMius.setOnClickListener {
            binding.edtList.setText("${binding.edtList.text}－")
        }
        binding.btnMultiplication.setOnClickListener {
            binding.edtList.setText("${binding.edtList.text}×")
        }
        binding.btnDivision.setOnClickListener {
            binding.edtList.setText("${binding.edtList.text}÷")
        }
        binding.btnReal.setOnClickListener {
            binding.edtList.setText("${binding.edtList.text}.")
        }
        binding.btnTotal.setOnClickListener {
            result = 0.0

            if (list.size != 0) {
                list = mutableListOf<String>()
            }
            if (binding.edtList.text.contains(".")) {
                if (binding.edtList.text.contains("+")) {
                    val str = binding.edtList.text.split("+")
                    val a = str[0].toDouble()
                    val z = a.toDouble()
                    for (i in 0..str.size - 1) {
                        if (i == 0) {
                            list.add(z.toString())
                            result += list.get(i).toDouble()
                        } else {
                            list.add(str[i])
                            result += list.get(i).toDouble()
                        }
                    }
                    binding.edtTotal.setText(String.format("%2f", result))
                }
                if (binding.edtList.text.contains("－")) {
                    val str = binding.edtList.text.split("－")
                    val a = str[0].toDouble()
                    val z = a.toDouble()
                    result = z
                    for (i in 0..str.size - 1) {
                        list.add(str[i])
                        if (i != 0) {
                            result -= list.get(i).toDouble()
                        }
                    }
                    binding.edtTotal.setText(String.format("%2f", result))
                }
                if (binding.edtList.text.contains("×")) {
                    val str = binding.edtList.text.split("×")
                    val a = str[0].toDouble()
                    val z = a.toDouble()
                    result = z
                    for (i in 0..str.size - 1) {
                        if (i == 0) {
                            list.add(str[i])
                            result *= list.get(i).toDouble()
                        }
                    }
                    binding.edtTotal.setText(String.format("%2f", result))
                }
                if (binding.edtList.text.contains("÷")) {
                    val str = binding.edtList.text.split("÷")
                    result = str[0].toDouble()
                    for (i in 0..str.size - 1) {
                        list.add(str[i])
                        if (i != 0) {
                            result /= list.get(i).toDouble()
                        }
                    }
                    binding.edtTotal.setText(String.format("%2f", result))
                }
            } else {
                if (binding.edtList.text.contains("+")) {
                    val str = binding.edtList.text.split("+")
                    val a = str[0].toDouble()
                    val z = a.toDouble()
                    for (i in 0..str.size - 1) {
                        if (i == 0) {
                            list.add(z.toString())
                            result += list.get(i).toDouble()
                        } else {
                            list.add(str[i])
                            result += list.get(i).toDouble()
                        }
                    }
                    binding.edtTotal.setText(String.format("%2f", result))
                }
                if (binding.edtList.text.contains("－")) {
                    val str = binding.edtList.text.split("－")
                    val a = str[0].toDouble()
                    val z = a.toDouble()
                    result = z
                    for (i in 0..str.size - 1) {
                        list.add(str[i])
                        if (i != 0) {
                            result -= list.get(i).toDouble()
                        }
                    }
                    binding.edtTotal.setText(String.format("%2f", result))
                }
                if (binding.edtList.text.contains("×")) {
                    val str = binding.edtList.text.split("×")
                    val a = str[0].toDouble()
                    val z = a.toDouble()
                    result = z
                    for (i in 0..str.size - 1) {
                        if (i == 0) {
                            list.add(str[i])
                            result *= list.get(i).toDouble()
                        }
                    }
                    binding.edtTotal.setText(String.format("%2f", result))
                }
                if (binding.edtList.text.contains("÷")) {
                    val str = binding.edtList.text.split("÷")
                    result = str[0].toDouble()
                    for (i in 0..str.size - 1) {
                        list.add(str[i])
                        if (i != 0) {
                            result /= list.get(i).toDouble()
                        }
                    }
                    binding.edtTotal.setText(String.format("%2f", result))
                }
            }
            binding.edtList.setText("")
        }

            binding.btnDelete.setOnClickListener {
                binding.edtList.setText("")
            }
            binding.btnBack.setOnClickListener {
                if (arithmetic != true) {
                    binding.edtTotal.setText(binding.edtList.text.dropLast(1))
                } else {
                    binding.edtList.setText(binding.edtList.text.dropLast(1))
                }
            }
            binding.edtTotal.text = binding.edtList.text
            binding.btnDelete.setOnClickListener {
                binding.edtList.setText("")
            }
            binding.btnBack.setOnClickListener {
                if (arithmetic != true) {
                    binding.edtList.setText(binding.edtList.text.dropLast(1))
                }
            }
            binding.btnClose.setOnClickListener {
                Toast.makeText(applicationContext, "계산기 프로그램종료", Toast.LENGTH_LONG).show()
                finish()
            }
        }
    }



