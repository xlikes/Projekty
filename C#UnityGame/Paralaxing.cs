using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Paralaxing : MonoBehaviour
{

    public Transform[] backgrounds; // tablica do przechowywania elementow backgrounds
    private float[] parallaxScales; //przechowanie proporcji dla kamery
    public float smoothing=1f; // poruszanie paralksujacych elementow musi byc powyzej 0

    private Transform cam; // Referencja do obiektu transform dla kamery
    private Vector3 previousCamPos; // pozycja kamery dla x,y,z


    void Awake() // wykonuje sie przed funkcja Start,  swietna do referencji zmiennych
    {
        cam = Camera.main.transform;

        
    }

    void Start()
    {
        previousCamPos = cam.position; // przypisanie x,y,z kamerze

        parallaxScales = new float[backgrounds.Length]; // przypisanie rozmiaru skali

        for (int i = 0; i < backgrounds.Length; i++) {
            parallaxScales[i] = backgrounds[i].position.z*-1;
            //przypisanie zbioru backgroundsów do odpowiedniej skali paralaksy
        }
    }

    void Update()
    {
        for (int i = 0; i < backgrounds.Length; i++) {
            //pomnozenie klatek przez skale przypisanie pozycji
            float parallax = (previousCamPos.x - cam.position.x) * parallaxScales[i];
            

            //ustawienie x wspolrzednej dla celu oraz dodanie wartosci parallax
            float backgroundsTargetPosX = backgrounds[i].position.x + parallax;
            

            //stworzenie pozycju dla celu
            Vector3 backgroundTargetPos = new Vector3(backgroundsTargetPosX, backgrounds[i].position.y, backgrounds[i].position.z);


            //przenikanie pomiedzy obecna pozycja a pozycja celu
            backgrounds[i].position = Vector3.Lerp(backgrounds[i].position, backgroundTargetPos, smoothing * Time.deltaTime);
        }
        // Ustawienie pozycji kamery pod koniec klatki
        previousCamPos = cam.position;
    }
}
