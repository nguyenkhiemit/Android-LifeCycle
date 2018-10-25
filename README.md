# Android-LifeCycle

Comment:<br>
1) when start activity A:<br>
  Main: <b>onCreate -> onStart -> onResume</b><br>
2) when click NEXT button to open Second Activity:<br>
  Main: <b>onPause -> onStop</b><br>
  Second: <b>onCreate -> onStart -> onStop</b><br>
3) when click BACK button to come back Main Activity:<br>
  Main: <b>onStart -> onResume</b><br>
  Second: <b>onPause -> onStop -> onDestroy</b><br>
4) when click Home button at Main Activity:<br>
  Main: <b>onPause -> onStop</b><br>
   and reverse action from background -> foreground:<br>
  Main: <b>onStart -> onResume</b><br>
   
