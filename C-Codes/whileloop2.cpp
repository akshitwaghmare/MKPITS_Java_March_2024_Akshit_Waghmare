 
#include <stdio.h>
#include <windows.h>
 
// Driver Code
int main()
{
    int x;
 
    // Loop for sound Jingle
    for (x = 0; x < 2; x++) {
        Beep(523, 500);
    }
 
   
    // sound Bell
    Beep(523, 800);
 
    Sleep(200);
 
    // Loop for sound Jingle
    for (x = 0; x < 2; x++) {
        Beep(5230, 5000);
    }
 
    // sound Bell
    Beep(5230, 8000);
 
    // Sound for rest of the tone
    Sleep(2000);
 
    Beep(5230, 5000);
 
    Sleep(500);
 
    Beep(6590, 4000);
 
    Sleep(500);
 
    Beep(4400, 4000);
 
    Sleep(500);
 
    Beep(4940, 4000);
 
    Sleep(500);
 
    Beep(5230, 7500);
 
    Sleep(4000);
 
    Beep(6000, 4000);
 
    Sleep(1000);
 
    Beep(6000, 3500);
 
    Sleep(2000);
 
    Beep(6000, 3000);
 
    Sleep(1500);
 
    Beep(6000, 2500);
 
    Sleep(1500);
 
    Beep(6000, 1500);
 
    Sleep(1500);
 
    Beep(5500, 2500);
 
    Sleep(1500);
 
    Beep(5555, 3500);
 
    Sleep(500);
 
    Beep(5555, 2000);
    Sleep(1500);
 
    Beep(5555, 2000);
 
    Sleep(1500);
 
    Beep(6900, 2000);
 
    Sleep(1500);
 
    Beep(6900, 2000);
 
    Sleep(1500);
 
    Beep(6100, 2000);
 
    Sleep(1500);
 
    Beep(5355, 1600);
 
    Sleep(1000);
 
    Beep(5000, 1500);
 
    Beep(5000, 500);
 
    Sleep(2000);
 
    Beep(7000, 2000);
 
    return 0; 
}

	