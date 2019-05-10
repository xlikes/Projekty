using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Opponent : MonoBehaviour
{
    [SerializeField] Transform SpawnPoint;
    [SerializeField] Transform player;
    public SpriteRenderer playerSprite; // dla obrazka gracza

    /*
    void OnTriggerEnter2D(Collider2D col) //Triger ustawic w oponencie 
    { // triger ustawic w oponencie
        ControlPanel.health--; // od globalnej zmiennej odejmujemy zycie
        if (ControlPanel.health == 0) // jesli zycia sa rowne 0 wywolujemy funkcje CheckHealth
        {
            CheckHealth();
        }
    }
    */



    void OnTriggerEnter2D(Collider2D col) //Triger ustawic w oponencie 
    {
        TestImmortal();
        
        if (ControlPanel.health == 0) // jesli zycia sa rowne 0 wywolujemy funkcje CheckHealth
        {
            Respawn(); // jesli zycia =0 postac ginie
        }
    }



    //===================================
    //Respawn Gracza do punktu RespawnPoint
    void Respawn()
    {
        
        Debug.Log("Ała");
        player.transform.position = SpawnPoint.transform.position; // pozycja gracza jest zmieniana na respawn
        ControlPanel.health = 4; // ustawiamy domyslna wartosc serduszek

        Invoke("playGameOver", 0.1f); // Po jednej sekundzie grany jest dzwiek z funkcji playGameOver
    }


    //===========================
    //Metoda sprawdzajaca niesmiertelnosc po otrzymaniu obrazen
    void TestImmortal()
    {

        if (ControlPanel.immortal == false)
        {
            PlayerMovement.RbPlayer.GetComponent<Rigidbody2D>().velocity = new Vector2(0, 10); // odpychanie gracza



            if (ControlPanel.health > 0)
            {
                flashing();
            }
            ControlPanel.immortal = true;
            ControlPanel.health--; // -1 zycie
            Invoke("resetImmortal", 2); //Opoznienie demage 2s
            Debug.Log(ControlPanel.health);



            SoundScript.PlaySound("sHit");//Dzwiek straty zycia
        }
    }

    void resetImmortal() {
        ControlPanel.immortal = false;
    }

    //============================
    //Funkcja Grajaca sampla GameOver
    void playGameOver(){
        SoundScript.PlaySound("sGameOver");
    }
    //============================

    void flashing() // Prosta funkcja migotania postaci
    {
        flashOff();
        Invoke("flashOn", 0.2f);
        Invoke("flashOff", 0.4f);
        Invoke("flashOn", 0.6f);
        Invoke("flashOff", 0.8f);
        Invoke("flashOn", 1);
        Invoke("flashOff", 1.2f);
        Invoke("flashOn", 1.4f);
        Invoke("flashOff", 1.6f);
        Invoke("flashOn", 1.8f);
    }

    void flashOn() // widocznosc gracza 1f czyli 100%
    {
        playerSprite.color = new Color(playerSprite.color.r, playerSprite.color.g, playerSprite.color.b, 1f);//Czerwony, zielony, niebieski, alfa
    }

    void flashOff() // widocznosc gracza 0.3f czyli 30%
    {
        playerSprite.color = new Color(playerSprite.color.r, playerSprite.color.g, playerSprite.color.b, 0.3f);//Czerwony, zielony, niebieski, alfa
    }







}
