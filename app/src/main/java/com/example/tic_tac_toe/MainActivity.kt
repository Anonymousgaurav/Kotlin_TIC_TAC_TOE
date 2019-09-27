package com.example.tic_tac_toe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btnclick(view:View)
    {

        val btnselected = view as Button
        var cellId = 0

        when(btnselected.id)
        {
            R.id.button1 -> cellId = 1
            R.id.button2 -> cellId = 2
            R.id.button3 -> cellId = 3
            R.id.button4 -> cellId = 4
            R.id.button5 -> cellId = 5
            R.id.button6 -> cellId = 6
            R.id.button7 -> cellId = 7
            R.id.button8 -> cellId = 8
            R.id.button9 -> cellId = 9

        }
//        Log.d("ButtonID",btnselected.id.toString())
//        Log.d("CellId",cellId.toString())

        playgame(cellId,btnselected)

    }

    var Activeplayer = 1
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()


    fun playgame(cellId:Int, btnselected: Button)
    {
        if(Activeplayer==1)
        {
            btnselected.text = "X"
            btnselected.setBackgroundResource(R.color.Player1)
            player1.add(cellId)
            Activeplayer = 2
        }

        else{
            btnselected.text = "O"
            btnselected.setBackgroundResource(R.color.Player2)
            player2.add(cellId)
            Activeplayer = 1
        }

        btnselected.isEnabled = false

        winnerr()
    }



    fun winnerr ()
    {
        var winner = -1

        //row

        if (player1.contains(1) && player1.contains(2)&& player1.contains(3))
        {
            winner = 1
        }

        if (player2.contains(1) && player2.contains(2)&& player2.contains(3))
        {
            winner = 2
        }

        if (player1.contains(4) && player1.contains(5)&& player1.contains(6))
        {
            winner = 1
        }

        if (player2.contains(4) && player2.contains(5)&& player2.contains(6))
        {
            winner = 2
        }

        if (player1.contains(7) && player1.contains(8)&& player1.contains(9))
        {
            winner = 1
        }
        if (player2.contains(7) && player2.contains(8)&& player2.contains(9))
        {
            winner = 2
        }

        // coloumn

        if (player1.contains(1) && player1.contains(4)&& player1.contains(7))
        {
            winner = 1
        }

        if (player2.contains(1) && player2.contains(4)&& player2.contains(7))
        {
            winner = 2
        }

        if (player1.contains(2) && player1.contains(5)&& player1.contains(8))
        {
            winner = 1
        }
        if (player2.contains(2) && player2.contains(5)&& player2.contains(8))
        {
            winner = 2
        }

        if (player1.contains(3) && player1.contains(6)&& player1.contains(9))
        {
            winner = 1
        }

        if (player2.contains(3) && player2.contains(6)&& player2.contains(9))
        {
            winner = 2
        }

        if (winner==1)
        {
            Toast.makeText(this,"Player 1 Wins",Toast.LENGTH_LONG).show()
        }
        else if(winner==2)
        {
            Toast.makeText(this,"Player 2 Wins",Toast.LENGTH_LONG).show()
        }
    }


}
