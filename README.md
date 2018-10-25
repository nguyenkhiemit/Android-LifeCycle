# Android-LifeCycle

Comment:<br>
1) when start activity A:<br>
  Main: onCreate -> onStart -> onResume<br>
2) when click NEXT button to open Second Activity:<br>
  Main: onPause -> onStop<br>
  Second: onCreate -> onStart -> onStop<br>
3) when click BACK button to come back Main Activity:<br>
  Main: onStart -> onResume<br>
  Second: onPause -> onStop -> onDestroy<br>
4) when click Home button at Main Activity:<br>
  Main: onPause -> onStop<br>
   and reverse action from background -> foreground:<br>
  Main: onStart -> onResume<br>
   
