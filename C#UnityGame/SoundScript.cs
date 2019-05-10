using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SoundScript : MonoBehaviour
{
    public static AudioClip sCoin, sJump,sHit,sGameOver,sCookie,sKill; // kazdy dzwiek musi miec swoja zmienna 
    static AudioSource audioSrc; // referencja do komponentu audiosource w Menagerze


    void Start()
    {
        sCoin = Resources.Load<AudioClip>("sCoin"); // definiowanie nazwy sampla dla zmiennej
        sJump = Resources.Load<AudioClip>("sJump");
        sHit = Resources.Load<AudioClip>("sHit");
        sGameOver = Resources.Load<AudioClip>("sGameOver");
        sCookie = Resources.Load<AudioClip>("sCookie");
        sKill = Resources.Load<AudioClip>("sKill");

        audioSrc = GetComponent<AudioSource>(); // pobranie komponentu z audiosource
    }

    void Update()
    {

    }

    public static void PlaySound(string clip) // funkcja wywolujaca odpowiednie dzwieki
    {

        switch (clip)
        {
            case "sCoin":
                audioSrc.PlayOneShot(sCoin); // dla coina
                break;
            case "sJump":
                audioSrc.PlayOneShot(sJump); // dla jumpa
                break;
            case "sHit":
                audioSrc.PlayOneShot(sHit); // dla stracenia zycia
                break;
            case "sGameOver":
                audioSrc.PlayOneShot(sGameOver); // dla game over
                break;
            case "sCookie":
                audioSrc.PlayOneShot(sCookie);// dla ciastka
                break;
            case "sKill":
                audioSrc.PlayOneShot(sKill);//dla pokonania przeciwnika
                break;
        }
    }
}
