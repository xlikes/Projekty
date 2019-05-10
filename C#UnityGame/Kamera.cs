using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Kamera : MonoBehaviour
{

    public Transform Player;
    public Vector3 wspolrzedneKamery;

    // Update is called once per frame
    void Update()
    {
        transform.position = Player.position + wspolrzedneKamery;
    }
}
