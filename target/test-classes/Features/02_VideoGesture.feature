

Feature: Vertifying the video Gestures 

  Scenario: Verify video functionality in the SkyTube Mobile app
  Given the user is on the SkyTube Mobile app home page
  When the user clicks on any video in the home page
  Then the user should be able to view the video
  Then the user should see the title of the video clicked

  When the user swipes up on the left side of the video
  Then the volume of the video should increase

  When the user swipes down on the left side of the video
  Then the volume of the video should decrease
  
   When the user swipes up on the right side of the video
  Then the brightness of the video should increase

  When the user swipes down on the right side of the video
  Then the brightness of the video should decrease

  When the user swipes up on the center of the video
  Then the user should be able to see the video description

  When the user long-presses and drags on the right side of the video
  Then the video should fast-forward

  When the user long-presses and drags on the left side of the video
  Then the video should rewind

	When the user clicks on a video that they have already watched
  Then a permission message should be displayed asking to resume the video
  
  When the user clicks on a video that they have already watched
  And the user clicks the "Resume" option
  Then the video should play from where it was last stopped
  
   When the user clicks on a video that they have already watched
  And the user clicks the "No" option
  Then the video should play from the beginning
  
  When the user clicks "Pause" button on the bottom of the video
  Then the video should stop
  
   When the user clicks "Play" button on the bottom of the video
  Then the video should play
  
  When the user clicks "FastForward" button on the bottom of the video
  Then the video should move Forward
  
  When the user clicks "FastBackward" button on the bottom of the video
  Then the video should Fast Backward
  
  When the user clicks "Back" icon on the top left corner of the video
  Then the page should move to the Home Page
  
  When the user clicks "Refresh" icon on the right corner of the video
  Then the page should refresh
  
  When the user clicks more options icon on the right corner of the video
  Then the list of action should display
