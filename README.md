# MagicNumbers
Simple app to recognizing file type

Notes:
  - files for checking included in resources directory
  - app firstly checks if file is TXT file (below 3 encoding types)
  - if it's not TXT then compares 'magic numbers' with list of types in 'Types' class
  - if actual type is different then input file type then throws appropriate exception
  - if actual type is the same as input file then put appropriate informaion.

Sample check for PNG file:
![commandlinecheck](https://user-images.githubusercontent.com/28845463/45597408-4d879c00-b9cc-11e8-8dc2-bb6efaabbad2.jpg)

For TXT files I was only able to implement UTF8 and UTF16(big and little). Unfortunately I was not able to do it for ANSI
![textfiles](https://user-images.githubusercontent.com/28845463/45597410-50828c80-b9cc-11e8-8917-362402a4b5fe.jpg)
