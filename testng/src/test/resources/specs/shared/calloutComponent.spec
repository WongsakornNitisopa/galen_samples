
@objects
  heading	h4
  text-*	p
		
= callout = on phone device

  @on phone
    heading:
      inside parent 10px top left
      width 90 to 100% of screen/width
    text-*:
      inside parent 10px top left
      width 90 to 100% of screen/width
      
  @on tablet
    heading:
      inside parent 10px top left
      width 80 to 90% of screen/width
    text-*:
      inside parent 10px top left
      width 80 to 90% of screen/width


  @on desktop
    heading:
      inside: parent 10px top left
      width: 75 to 85% of screen/width
    text-*:
      inside: parent 10px top left
      width: 75 to 85% of screen/width
