Feature: Validate Home Page
  
  As a user, I want to ensure that the SkyTube application home page is functioning correctly, including the title and tabs.


  Scenario: Fast forward a video in skytube app
    When the user drags the line on bottom of the video to right side
    Then the video should move to a later timestamp

  Scenario: Fast backward a video in skytube app
    When the user drags the line on bottom of the video to left side
    Then the video should move to a earlier timestamp

  Scenario: Validate icons on the title bar
    And click on back button
    Then the following icons should be present on the title bar:
      | Menu Icon          |
      | Search Icon        |
      | Video Blocker Icon |
      | More Options Icon  |

  Scenario: Validate Main Options
    Then the following preferences option should be present on clicking settings icon
      | Enter Video URL       |
      | Watched Video Cleaner |
      | Preferences           |

  Scenario: Validate Enter Video URL functionality
    When I click on the "Enter Video URL" option
    And I enter a valid video URL
    Then I should see the video playing when I click the "Play" button
    And the video should not play when I click the "Cancel" button

  Scenario: Validate tabs on the home page
    Then the following tabs should be displayed on the top bar:
      | TRENDING (US) |
      | FEED          |
      | BOOKMARKS     |
      | DOWNLOADS     |
      
      
  Scenario: Bookmark a video
    When I click on the more options for a video
    And I select the "Bookmark" option
    Then the video should appear in the "BOOKMARKS" tab

  Scenario: Download a video
    When I click on the more options for a video
    And I select the "Download" option
    Then the video should appear in the "DOWNLOADS" tab

  #Scenario: Watched video cleaner functionality
    #When I click on watched video cleaner option
    #And I click on clean button
    #Then I can see the videos removed from watched bookmarks and downloads
#
  #Scenario: Validate preferences options
    #Then the following options should be present on clicking preferences
      #| Video Player          |
      #| Video Blocker         |
      #| SponserBlock          |
      #| Import/Export         |
      #| Privacy               |
      #| Network and Downloads |
      #| Others                |
      #| About                 |
#
  #Scenario: Search video functionality
    #When I search for a video "Numpy Ninja" in search bar
    #Then I should see the video "Numpy Ninja" in search results
#
#
  #Scenario: Validate Video Options
    #Then the following options need to be present on the video settings
      #| Open with...    |
      #| Share via...    |
      #| Copy URL        |
      #| Bookmark        |
      #| Download        |
      #| Channel...      |
      #| View Thumbnail  |
      #| Mark as Watched |
#
  #Scenario: Validate Subscribed video
    #When I click on the channel name and the subscribe button
    #And I click on the menu button
    #Then I should see the subscribed video on the subscription panel
#
  #Scenario: Search channel functionality
    #When I click Menu icon and search for subscribed channel name "ABC News"
    #Then I should see the vides related to the channel name "ABC News" in search results
#
  #Scenario: Validate Channel Options
    #When I click on settings options in the video
    #And I click on channel option
    #Then I should see the following options
      #| Open Channel   |
      #| Subscribe      |
      #| Block Channel  |
      #| Permit Channel |
#
  #Scenario: Validate view thumbnail option
    #When I click on settings options in the video
    #And I click on view thumbnail option
    #Then I should see the thumbnail image and download image on the bottom
#
  #Scenario: Block a channel and verify notifications
    #When I open the settings options for the video
    #And I select the channel option
    #And I block the channel and refresh the page
    #Then I should see a notification confirming the channel is blocked
#
  #Scenario: Validate channel details for a video
    #When I select a video from the home page
    #Then I should see the following channel details displayed:
      #| Channel Name  | Numpy Ninja |
      #| View Count    | 835 views   |
      #| Uploaded Time | 2 years ago |
