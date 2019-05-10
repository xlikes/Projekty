using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ControlPanel : MonoBehaviour
{
    public static int scoreValue; // wynik gracza
    public static int health=4; // zycia gracza
    public static bool immortal = false; // warunek dla niesmiertelnosci po otrzymaniu damagu

    void Start() { // startowe wartosci
        scoreValue = 0;
    }

}
