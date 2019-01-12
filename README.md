# Android-LifeCycle

Comment:<br>
<h3>Activity</h3>
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
5) when kill app:<br>
  Main: <b>onDestroy</b>

<h3>Fragment</h3>
1) When start Fragment First:<br>
<b>onAttach -> onCreate -> onCreateView -> onActivityCreated -> onStart -> onResume</b><br>
  with START: <br>
2) Open Fragment Second:<br>
  Frist: <b>onPause -> onStop -> onDestroyView</b><br>
  Second: <b>onAttach -> onCreate -> onActivityCreated -> onStart -> onResume</b><br>
3) When click back button on second fragment<br>
  Frist: <b>onCreateView -> onActivityCreated -> onStart -> onResume</b><br>
  Second: <b>onPause -> onStop -> onDestroyView -> onDestroy -> onDetach</b><br>
4) when click Home button at Frist Fragment:<br>
  Frist: <b>onPause -> onStop</b><br>
  and reverse action from background -> foreground:<br>
  Frist: <b>onStart -> onResume</b><br>
  
