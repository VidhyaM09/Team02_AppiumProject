Feature: Video Setting

  Background: 
    Given User is on home page of skytube app
    #Given the user is on the SkyTube Mobile app home page
    When User clicks more options menu in any video

  
  Scenario: Open a video via youtube app.
    And Clicks on Open with
    Then video should directly open in a you tube app.

  #Scenario: Sharing a video via gmail
    #And clicks share via to send through gmail
    #Then User should be redirected to gmail loginpage
#
  #Scenario: copy url
    #And Copies the URL and pastes it into the search field by long press , then presses Enter
    #Then User finds the related video in the results .
#
  #Scenario: To bookmark any video
    #And Clicks bookmark option
    #Then a prompt should appear showing “Bookmarked”  and in the bookmarks toolbar video should present.
#
  #Scenario: To Download any video
    #And Clicks download ,if done for the first time after app is installed
    #Then A dialogue box appears “ Allow skytube to  acess files ,audio,videos from your system “
    #And Click ok
    #Then Downloaded videos should be in the Downloads toolbar.
#
  #Scenario: To Subscribe any channel
    #And Clicks Channel ,choose subscribe from drop down
    #Then a prompt should appear saying “subscribed”.
#
  #Scenario: To block any channel
    #And : Clicks Channel,choose block channel from drop down
    #Then : a prompt should appear saying “Refresh to use the new channel blacklist ”
#
  #Scenario: To unblock a channel
    #When Clicks on “Blocked video” icon on top right
    #And chooses the video to unblock from the list and clicks setup button
    #And deselects the video blocker option,comes to home page
    #Then blocked video  icon should be  refreshed to check whether video is unblocked or not.
#
  #Scenario: To permit a channel
    #And Clicks Channel ,choose permit  from drop down
    #Then a prompt should appear saying “Could not remove the given channel from deny list”
#
  #Scenario: View Thumbnail
    #And Clicks view thumbnail
    #Then a reduced size version of the same video should appear.
#
  #Scenario: Continuous repetition.
    #When User plays any video ,clicks pause button
    #And goes to home page
    #And Clicks the same video on the home page.
    #Then A dialogue box should appear  with No and Resume options saying “Continue from where you stopped “  .
