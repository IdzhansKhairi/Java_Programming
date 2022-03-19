# HTML Notes

# **1. HTML INTRODUCTION**
## HTML - Introduction
- HTML = Hyper Text Markup Language
- One of 3 cores of development technologies which is HTML, CSS, JavaScript
- **HTML** = Responsible creating structure of webpage
- **CSS**  = Responsible for styling and formating HTML elements.
- **Javascript** = Responsible to add functionality to the HTML elements
- The main purpose of creation of HTML is to create webpages for sharing information.


## HTML - Code Editor Setup
### 1. Using Text File
- Create a text file
- Edit a little bit by adding some HTML Codes
- Save it as .html file

### 2. Using codepen.io
![Intro Codepen](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/Screenshot%202022-02-25%20202747.png)

### 3. Using VS Code
![Intro VS Code](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20pic%201.png)


## HTML - Structure of a HTML Document
Lets us consider the following code :
```html
<!DOCTYPE html>
<html>
<head>
        <meta charset="UTF-8">
        <title>My HTML Page</title>
</head>
<body>
        <!--Other HTML Elements-->
        <p>This is an HTML Paragraph</p>
        <h1>This is a heading tag</h1>

        <img/>
        <br/>
</body>
</html>
```
- The first line is document type. A HTML Page always starts with the document type declaration or doc type. This is a way to tell the browser what type of document it is.
- The 2nd line is the HTML tags. It represents the route of an HTML documents. It is the countainer of all other HTML elements.
- The *head* elements contain metadata like document title, character set, styles, links, scripts and etc.
- The *meta* elements is used to specify the metadata to provide browsers and search engines with technical information about the webpage like in this case it specifies the character encoding for this HTML document as *UTF-8*.
- The *title* elements is to define our title document. So the title is visible in the browser tab.
- The *body* tag contains the content of the document that contain all of the HTML elements that used to design a webpage. For examples, headings, images, paragraph, lists, etc.
- The *p* tag is for paragraph
- A HTML tags is a combinational of characters enclosed in angle brackets. Each tags have different purpose. For example *p* is for paragraph tag and *h1* is for heading tag.
- There are 2 types of tags in HTML which is **paired** and **unpaired** tags. Some tags need a closing tags because there are some content. For example the paragraph and heading tab need closing tag.
- The *img* which is image tag and *br* which is break line tab does not require closing tag and called **unpaired** tag.





# **2. HTML BASICS**
## HTML - Adding Heading in a Webpage
- HTML provides us with 6 different heading tags from *h1* to *h6*.
- *h1* represents the most important headings and *h6* represents the least important headings.
- Consider the following code :
```html
<html>
<head>
        <title>HTML - Headings</title>
</head>
<body>
        <h1>I am a h1 Heading</h1>
        <h2>I am a h2 Heading</h2>
        <h3>I am a h3 Heading</h3>
        <h4>I am a h4 Heading</h4>
        <h5>I am a h5 Heading</h5>
        <h6>I am a h6 Heading</h6>
</body>
</html>
```
![HTML - Headings](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Headings.png)


## HTML- Adding Paragraph in a Webpage
- To write a paragraph, we will be using *p* tags.
- To bold a certain word or sentence in the paragraph, we will use *b* tags.
- To italic a certain word or sentence in the paragraph, we will use *i* tags.
- There are 2 ways to make a sentence in the next line, by *br* tags or *pre* tags.
- **br tags :** The br element represents a break line
- **pre tags :** The pre elements represents a block of preformatted text in which structure is represented by typographics conventions rather than by elements.
```html
<html>
<head>
        <title>HTML - Paragraphs</title>
</head>
<body>
        <p>Everyone is a <b>genius</b>. <br/>
                But if you <i>judge a fish</i> by its ability to climb a tree, <br/>
                it will live its whole life believing that it is stupid.</p>

        <pre>
        <p>Everyone is a <b>genius</b>.
But if you <i>judge a fish</i> by its ability to climb a tree,
it will live its whole life believing that it is stupid.</p>
        </pre>
        
</body>
</html>
```
![HTML Paragraphs](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Paragraphs.png)


## HTML - Adding Images in a Web Page
- By using the *img* tags, we don't need to put the closing tag.
- *img* tags requires 2 attributes which is *src* and alternate tag *(alt)*
- *src* values specifies the location of the image and *alt* tag is the description of the image.
- *src* ust copy image address
```html
<html>
<head>
        <title>HTML - Embed Image</title>
</head>
<body>
        <img src="https://www.prestigeanimalhospital.com/sites/default/files/interesting-cat-facts.jpg" alt="Cute Cat Picture"/>
</body>
</html>
```
![HTML - Pictures 1](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Picture%201.png)

- However as we can see the picture is to big.
- We can add another attribute which is height and width.
- The number input is not represents pixel
```html
<html>
<head>
        <title>HTML - Embed Image</title>
</head>
<body>
        <img src="https://www.prestigeanimalhospital.com/sites/default/files/interesting-cat-facts.jpg" alt="Cute Cat Picture" 
        width="600" height="350" />
</body>
</html>
```
![HTML - Pictures 2](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Picture%202.png)

- Now let's say we have our own image in the local file in our computer.
- In this method we are selecting offline images.
- The picture down here shows the jpg files located in my computer.
![Pic in File](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Picture%203.png)
```html
<html>
<head>
        <title>HTML - Embed Image</title>
</head>
<body>
        <img src="/HTML Language/16_2_2022__1_35_11.png" alt="Windbound 1" width="600" height="350" />
</body>
</html>
```
![HTML - Pictures 3](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Picture%204.png)

- Now lets us look back at *alt* tags. The *alt* tags is some sort of the description of the image that you are using.
- It has two focus. First, if the image cannot loaded for any reason, it shows this tet to the web users.
- Second, this attribute help the search engine and makes the image. For example if a person was looking a picture in google, google as the search engine will try to match the search from the user with the search results. And that's why adding an appropriate alt text is important.
```html
<html>
<head>
        <title>HTML - Embed Image</title>
</head>
<body>
        <img src="/HTML Language/16_2_2022__1_35_11.jpg" alt="Windbound boat Scenary" width="600" height="350" />
</body>
</html>
```
![HTML - Pictures](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Picture%205.png)


## HTML - Creating Ordered and Unordered List
- There are two types of list which is ordered list and unordered list.
- Odered list have a sequence which can be 1, 2, 3, or A, B, C and so on.
- Unordered list don't have sequence which it is more like a bullet points.
- For ordered list, we using the *ol* tags and it also needs closing tags. In the *ol* block, it also needs *li* tags which is represents a list of items.
- **ol :** The *ol* elements represents a list of items, where the items have been intentionally ordered, such as changing the order would change the meaning of the document.
- **li :** The *li* element represents a list item. If its parents element is an *ol*, *ul* or menu element, then the element is an item of the parent element's list, as defined for those elements. Otherwise, the list item has no defined list-related relationship to any other *li* element.
- Note : To make a few lines as comment, CTRL + /.
```html
<html>
<head>
        <title>HTML - List</title>
</head>
<body>
        <h1>Planets in Solar System</h1>
        <ol>
                <li>Mercury</li>
                <li>Venus</li>
                <li>Earth</li>
                <li>Mars</li>
                <li>Jupiter</li>
                <li>Saturn</li>
                <li>Uranus</li>
                <li>Neptune</li>
                <li>Pluto</li>
        </ol>
</body>
</html>
```
![HTML - List 1](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20List%201.png)

- By default, the ordered list will be in number in increasing order.
- However this can be change for many kind of style of ordered list.
- Change it by adding type at the *ol*.
- There are a lot of types for the ordered list style :
![HTML - Ordered List Types](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20List%203.png)

```html
<html>
<head>
        <title>HTML - List</title>
</head>
<body>
        <h1>Planets in Solar System</h1>
        <ol type="A">
                <li>Mercury</li>
                <li>Venus</li>
                <li>Earth</li>
                <li>Mars</li>
                <li>Jupiter</li>
                <li>Saturn</li>
                <li>Uranus</li>
                <li>Neptune</li>
                <li>Pluto</li>
        </ol>
</body>
</html>
```
![HTML - List 2](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20List%202.png)

- For unordered list, the HTML tag is *ul*.
- The dot bullet is the default bullet.
```html
<html>
<head>
        <title>HTML - List</title>
</head>
<body>
        <h1>Planets in Solar System</h1>
        <ul>
                <li>Mercury</li>
                <li>Venus</li>
                <li>Earth</li>
                <li>Mars</li>
                <li>Jupiter</li>
                <li>Saturn</li>
                <li>Uranus</li>
                <li>Neptune</li>
                <li>Pluto</li>
        </ul>
</body>
</html>
```
![HTML - List 4](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20List%204.png)

- To change the type of the bullet, we add style="" at the *ul* tag.
- There are a lot of choices of style of the unordered list bullets.
![Unordered List Type](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20List%206.png)
```html
<html>
<head>
        <title>HTML - List</title>
</head>
<body>
        <h1>Planets in Solar System</h1>
        <ul style="list-style-type:square">
                <li>Mercury</li>
                <li>Venus</li>
                <li>Earth</li>
                <li>Mars</li>
                <li>Jupiter</li>
                <li>Saturn</li>
                <li>Uranus</li>
                <li>Neptune</li>
                <li>Pluto</li>
        </ul>
</body>
</html>
```
![HTML - List 5](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20List%205.png)



## HTML - Adding Styles and Formating HTML Elements
- We will learn on how to add custom styles on HTML.
- Let's consider the following HTML page below :
```html
<html>
<head>
        <title>HTML - Formating and Styling</title>
</head>
<body>
        <h1>Our Solar System</h1>
        <img src="https://static.tweaktown.com/news/8/1/81145_100_heres-all-of-the-planets-in-our-solar-system-ranked_full.jpg" alt="Our Solar System" width="700" height="400">
        
        <p>The solar system is the gravitional bound planatery system of the Sun and the Objects that orbit it, either directly or indirectly. Of the objects that orbit sun directly, the largest are the eight planet, with the remainder of being
smaller objects, such as the five dwarf planets and small Solar System bodies. Of the objects orbit the Sun indirectly - the moons - two are larger than the smallest planet, Mercury.
        </p>

        <p>
The solar system formed 4.6 billion years ago from the gravitional collapse of a giant interstellar molecular cloud. The vast majority of the system's mass is in the Sun, with the majority of the remaining mass countained in Jupiter.
The four smaller inner planets, Mercury, Venus, Earth and Mars, are terrestrial planet, being primarily composed of rock and metal. The four outer planets are giant planets, being substantially more massive than the terrestrials. The
two largest, Jupiter and Saturn, are gas giants, being composed mainly of hydrogen and helium; the two outermost planets, Uranus and Neptune, are ice giants, being composed mostly of substances with relative high melting points
compared with hydrogen and helium, called volatiles, such as water, ammonia and methane. All eight planets have almost circular orbits that lie within a nearly flat disc called the ecliptic.
        </p>

        <h3>Lists of Planets in Our Solar System</h3>
        <ul>
                <li>Mercury</li>
                <li>Venus</li>
                <li>Earth</li>
                <li>Mars</li>
                <li>Jupiter</li>
                <li>Saturn</li>
                <li>Uranus</li>
                <li>Neptune</li>
                <li>Pluto</li>
        </ul>
</body>
</html>
```
![HTML - Styling 1](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Styling%201.png)

- The webpage is doesnt look very good.
- But we can make it good by adding some colours, spacing between elements and background.
- How do we do all of this? Well we can use CSS cascading for styling.
- CSS provide as with options to add all of these styles and much more. 
- To add CSS style, HTML provide us with an attribute called *style*.
- First let's make our image full screen.
- As we can see here the image has expanded its width to the entire screen by adding _width:100%_.
- To add another property such as _height:600px_ we have to add semicolon**(;)** after _width_.
- Pixel is the unit used for dimension here. So, even the font size or the border radius, whenever we were working with dimensions, we'll be using unit pixels.
```html
<img src="https://static.tweaktown.com/news/8/1/81145_100_heres-all-of-the-planets-in-our-solar-system-ranked_full.jpg" alt="Our Solar System" width="700" height="400" style="width:100%; height:600px;">
```
![HTML - Styling 2](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Styling%202.png)

- Now as we can see in the previous picture, there are some small gap or space between our edge of the screen and the image.
- This is because HTML by default add 8 pixels margin.
- Hence we add the _body style="margin: 0"_
- As we can see there is no gap between the edge of the screen and the image itself.
```html
<body style="margin: 0;">
```
![HTML - Styling 3](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Styling%203.png)

- As we can see also there is no top or bottom margin on the headings.
- So, to create or give a gap or space, we also can add _h1 style="margin-top: 60px; margin-bottom: 60px"_.
```html
<h1 style="margin-top: 60px; margin-bottom: 60px">Our Solar System</h1>
```
![HTML - Styling 4](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Styling%204.png)

- Now let's us bring the header at the centre of the screen.
- There's another property which is _text-allign: centre_.
- To increase the font size, we using the property of _font-size:_
```html
<h1 style="margin-top: 60px; margin-bottom: 60px; text-align: center; font-size: 48px">Our Solar System</h1>
```
![HTML - Styling 5](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Styling%205.png)

- Now let's move to the paragraph section.
- So let's add padding on all the sides.
- Padding is a little bit different than margin because we are adding it at all sides (top, bottom, left, right).
- And as we can see there are some gap in the paragraph by all sides.
- To increase the font size, use _font-size:_ properties.
- To increse the space of the line in a pragraph, we add another property which is _line-height_ with no "px".
- If you wanted to do the same thing for the second paragraph, just copy and paste the styling.
```html
<p style="padding: 16px; font-size: 24px; line-height: 2.0;">The solar system is the gravitional bound planatery system of the Sun and the Objects that orbit it, either directly or indirectly. Of the objects that orbit sun directly, the largest are the eight planet, with the remainder of being
smaller objects, such as the five dwarf planets and small Solar System bodies. Of the objects orbit the Sun indirectly - the moons - two are larger than the smallest planet, Mercury.
        </p>

        <p>
        The solar system formed 4.6 billion years ago from the gravitional collapse of a giant interstellar molecular cloud. The vast majority of the system's mass is in the Sun, with the majority of the remaining mass countained in Jupiter.
The four smaller inner planets, Mercury, Venus, Earth and Mars, are terrestrial planet, being primarily composed of rock and metal. The four outer planets are giant planets, being substantially more massive than the terrestrials. The
two largest, Jupiter and Saturn, are gas giants, being composed mainly of hydrogen and helium; the two outermost planets, Uranus and Neptune, are ice giants, being composed mostly of substances with relative high melting points
compared with hydrogen and helium, called volatiles, such as water, ammonia and methane. All eight planets have almost circular orbits that lie within a nearly flat disc called the ecliptic.
        </p>
```
![HTML - Styling 6](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Styling%206.png)

- Let's go to the list, we can also change the font at _ul style="margin: "_
- This will make the font a little bit bigger.
```html
<h3 style="font-size: 24px; padding-left: 16px;">Lists of Planets in Our Solar System</h3>
<ul style="font-size: 24px">
      <li>Mercury</li>
      <li>Venus</li>
      <li>Earth</li>
      <li>Mars</li>
      <li>Jupiter</li>
      <li>Saturn</li>
      <li>Uranus</li>
      <li>Neptune</li>
      <li>Pluto</li>
 </ul>
```
![HTML - Styling 7](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Styling%207.png)

- We can also add background colour in our webpage.
- All we have to do is add it at the _body_.
- We can choose the colour by using the colour code or just simply type the colour or choose the colour from colour pane (rgb) in the vs code itself.
```html
<body style="margin: 0; background-color: lightcoral;">
```
![HTML - Styling 8](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Styling%208.png)

- Similarly, if we wanted change the colour of font.
- We will use _color:_ property.
- As we can see we already change the heading of the website colour.
```html
<h1 style="margin-top: 60px; margin-bottom: 60px; text-align: center; font-size: 48px; color: darkorchid;">Our Solar System</h1>
```
![HTML - Styling 9](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Styling%209.png)


## HTML - Block and Inline Display Values
- Every HTML elements has a default display value which either can be block or inline.
- A block-level element always starts on a new line, and the browsers automatically add some space (a margin) before and after the element.
- A block-level element always takes up the full width available (stretches out to the left and right as far as it can).
- An inline element does not start on a new line.
- An inline element only takes up as much width as necessary.
![HTML Block Elements](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20-%20Elements%20(Blocks).png)
![HTML Inline Elements](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20-%20Elements%20(Inline).png)

- Now this is an example of block value.
- As we can see it taking the entire available space of our screen
```html
<html>
<head>
        <title>Block vs Inline Elements</title>
</head>
<body>
        <div style="background-color: lightblue">
                <h2>This is a heading</h2>
                <p>This is another paragraph</p>
        </div>

        <h2 style="background-color: lightcoral">This is a heading</h2>
        <p style="background-color: lightgreen">This is another paragraph</p>
</body>
</html>
```
![HTML - Block vs Inline 1](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Block%20vs%20Inline%201.png)

- Below here is an example of the Inline Value
- As we can see even coded in different lines, the words are in one line on the websites.
- This is actually perfect to make it look like menu items.
```html
<html>
<head>
        <title>Block vs Inline Elements</title>
</head>
<body>
        <span style="background-color:lightblue; font-size: 24px; padding: 12px;">Home</span>
        <span style="background-color:lightblue; font-size: 24px; padding: 12px;">Profile</span>
        <span style="background-color:lightblue; font-size: 24px; padding: 12px;">About</span>
        <span style="background-color:lightblue; font-size: 24px; padding: 12px;">Contact</span>
</body>
</html>
```
![HTML - Block vs Inline 2](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Block%20vs%20Inline%202.png)

- As we can see, we can also combine the Block and Inline together.
- This makes the website have top bar with menu items.
```html
<html>
<head>
        <title>Block vs Inline Elements</title>
</head>
<body>
        <div style="background-color:lightseagreen; padding:24px">
                <span style="background-color:lightblue; font-size: 24px; padding: 12px;">Home</span>
                <span style="background-color:lightblue; font-size: 24px; padding: 12px;">Profile</span>
                <span style="background-color:lightblue; font-size: 24px; padding: 12px;">About</span>
                <span style="background-color:lightblue; font-size: 24px; padding: 12px;">Contact</span>
        </div>
</body>
</html>
```
![HTML - Block vs Inline 3](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Block%20vs%20Inline%203.png)


## HTML - Adding Group Styles Using Class Attributes
- How to style a group of HTML elements with the same styling.
- Let's us look at the following code down below.
```html
<html>
<head>
        <title>Adding Group Styles Using Class Attributes</title>
</head>
<body>
        <div>
                <img src="https://cdn.mos.cms.futurecdn.net/xLXT69hv4k2U5pfKLBCanC-970-80.jpg" alt="Mercury">
                <p>
                        Mercury is the closest planet to the sun, and it's also the smallest, only a little bit larger than Earth's 
                        moon. Because its so close to the sun (about two-fifths the distance between Earth and the sun), Mercury 
                        experiences dramatic changes in its day and night temperatures: Mercury temperatures can reach a scorching 
                        840 F (450 C) in the day, which is hot enough to melt lead. Meanwhile, on the night side, temperatures drop 
                        to minus 290 F (minus 180 C). 
                </p>
        </div>

        <div>
                <img src="https://cdn.mos.cms.futurecdn.net/oFF43BjXYUyyMTTJLFpeDE-970-80.jpg" alt="Venus">
                <p>
                        The second planet from the sun, Venus is Earth's twin in size. Radar images beneath its atmosphere reveal 
                        that its surface has various mountains and volcanoes. But beyond that, the two planets couldn't be more 
                        different. Because of its thick, toxic atmosphere that's made of sulfuric acid clouds, Venus is an extreme 
                        example of the greenhouse effect. It's scorching-hot, even though Mercury is closer to the sun, Venus is 
                        the hottest planet in the solar system. 
                </p>
        </div>
</body>
</html>
```
![HTML - Group Styling 1](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Group%20Styling%201.png)

- As we can see above, there are two planets with some description. Let's us modify the website a little bit.
- To modify it a little bit we have to add style at each of the attribute.
- As we can see, a little modification has been made below.
```html
<html>
<head>
        <title>Adding Group Styles Using Class Attributes</title>
</head>
<body>
        <div>
                <img src="https://cdn.mos.cms.futurecdn.net/xLXT69hv4k2U5pfKLBCanC-970-80.jpg" alt="Mercury" style="height: 350px;
                width: 350px;">
                <p style="font-size: 24px; line-height: 1.5">
                        Mercury is the closest planet to the sun, and it's also the smallest, only a little bit larger than Earth's 
                        moon. Because its so close to the sun (about two-fifths the distance between Earth and the sun), Mercury 
                        experiences dramatic changes in its day and night temperatures: Mercury temperatures can reach a scorching 
                        840 F (450 C) in the day, which is hot enough to melt lead. Meanwhile, on the night side, temperatures drop 
                        to minus 290 F (minus 180 C). 
                </p>
        </div>

        <div>
                <img src="https://cdn.mos.cms.futurecdn.net/oFF43BjXYUyyMTTJLFpeDE-970-80.jpg" alt="Venus" style="height: 350px;
                width: 350px">
                <p style="font-size: 24px; line-height: 1.5">
                        The second planet from the sun, Venus is Earth's twin in size. Radar images beneath its atmosphere reveal 
                        that its surface has various mountains and volcanoes. But beyond that, the two planets couldn't be more 
                        different. Because of its thick, toxic atmosphere that's made of sulfuric acid clouds, Venus is an extreme 
                        example of the greenhouse effect. It's scorching-hot, even though Mercury is closer to the sun, Venus is 
                        the hottest planet in the solar system. 
                </p>
        </div>
</body>
</html>
```
![HTML - Group Styling 2](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Group%20Styling%202.png)

- However, the problem is that when I wanted to change style, I have to put styling in each elements.
- Luckily as in this code above, we only have 2 elements which is Mercury and Venus.
- Imagine if we have to put styling in so many elements for example 100 elements.
- To solve this problem, we can use classes to bring all the styles together.
- For example here we added _class="planet-image"_ to each of the images attributes and _class="planet-desc"_ to each of the paragraph attribute.
- And then we add _style_ tags under the _title_ tags.
- In the _style_ we add _.planet-image_ and _.planet-desc_ with curly bracket. And then we add the styling we wanted.
- This time we change the height of the image is 350px and the width of the image is 550px.
```html
<html>
<head>
        <title>Adding Group Styles Using Class Attributes</title>

        <style>
                .planet-image{
                        height: 350px; 
                        width: 550px;
                }
                .planet-desc{
                        font-size: 24px; 
                        line-height: 1.5;
                }
        </style>
</head>
<body>
        <div>
                <img class="planet-image" src="https://cdn.mos.cms.futurecdn.net/xLXT69hv4k2U5pfKLBCanC-970-80.jpg" alt="Mercury">
                <p class="planet-desc" style="font-size: 24px; line-height: 1.5">
                        Mercury is the closest planet to the sun, and it's also the smallest, only a little bit larger than Earth's 
                        moon. Because its so close to the sun (about two-fifths the distance between Earth and the sun), Mercury 
                        experiences dramatic changes in its day and night temperatures: Mercury temperatures can reach a scorching 
                        840 F (450 C) in the day, which is hot enough to melt lead. Meanwhile, on the night side, temperatures drop 
                        to minus 290 F (minus 180 C). 
                </p>
        </div>

        <div>
                <img class="planet-image" src="https://cdn.mos.cms.futurecdn.net/oFF43BjXYUyyMTTJLFpeDE-970-80.jpg" alt="Venus">
                <p class="planet-desc">
                        The second planet from the sun, Venus is Earth's twin in size. Radar images beneath its atmosphere reveal 
                        that its surface has various mountains and volcanoes. But beyond that, the two planets couldn't be more 
                        different. Because of its thick, toxic atmosphere that's made of sulfuric acid clouds, Venus is an extreme 
                        example of the greenhouse effect. It's scorching-hot, even though Mercury is closer to the sun, Venus is 
                        the hottest planet in the solar system. 
                </p>
        </div>
</body>
</html>
```
![HTML - Group Styling 3](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Group%20Styling%203.png)


## HTML - Adding Hyperlinks in a Webpage
- How to add a link in a HTML page.
- Link could be a text, an image or any HTML elemnets.
- When the user click on this link, it can redirect to a website or a different web page of the same website or the different section within the same webpage.
- The tags is _a href=""_ that also needs a closing tags. _href_ defines where the user needs to be redirected.
- We will use this [Virtual Piano Link](https://www.onlinepianist.com/virtual-piano) to redirect us to the website in the HTML page.
- We will put the website links at the _href=""_ and then we add the HTML elements inside the _a_ tags.
- Consider the following code where we use text (It will open new URL in the same browser tab) :
```html
<html>
<head>
        <title>HTML - Links</title>
</head>
<body>
        <a href="https://www.onlinepianist.com/virtual-piano">Virtual Piano - Online Piano Keyboard | Online Pianist</a>
</body>
</html>
```
![HTML - Hyperlinks 1](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Hyperlinks%201.png)
![HTML - Hyperlinks 2](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Hyperlinks%202.png)

- We can also make it to open in a new tab.
- For that we have to use another attribute called _target="_blank"_ 
```html
<html>
<head>
        <title>HTML - Links</title>
</head>
<body>
        <a href="https://www.onlinepianist.com/virtual-piano" target="_blank">Virtual Piano - Online Piano Keyboard | Online Pianist</a>
</body>
</html>
```
![HTML - Hyperlinks 3](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Hyperlinks%203.png)

- Now let's create an image link
- First we find an image and copy its image address.
- And then we put the tag inside our _a_ tags with closing tags.
- As we can see, we can click the image and it will redirect us to our desire website
```html
<html>
<head>
        <title>HTML - Links</title>
</head>
<body>
        <a href="https://www.onlinepianist.com/virtual-piano" target="_blank">
                <img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAKoAAACqCAMAAAAKqCSwAAAAIVBMVEX///8AAADi4uKOjo5hYWE8PDwQEBAhISGtra3X19fy8vLU3QgAAAAEUElEQVR4nO2a2ZKjMAxFQd4w///Bo8UbgTAzL3Ye7qlZKmm6ciIkWYC3DQAAAAAAAAAAAAAAAAAAAAAAAAAAADAXcj6EuDMxeO9otc83nFfJkeCd82zPeLfar0KuerKV/CkvB/v4E7LkTSa4TAUXimBKiYOaknyL9RmhEY3hoEbLhZgkCZS03pWCnt3ueXwkLQdb4dD7paZOZLw5cg21LL3aqmvY40pTyVKfRTM8KHZXTYN9X1ha4uco+/TmaZ1B03VdBrBpPJx5cgE9n/3uujADxNTsUuh1vifvn1y9FNaiHuBri6+elo9J2uqTq+OutiZZR52o7dNrWAN9cU2rkvXzJCfr9dFU6SkH/BLVp94UXI8q0cMBaYHqY8xaQyqr1kMDm6/6FDE7w5IAVTXfXePsbuW+ds+kRU7fXSevV/TS570snsOEdT8izFR9ztMa1n0fhsGPKSscYW5YX4LKNrwgXTmctysW+Qp5bljfTEWW3pi7tr5Oe5dUfWDuIEivpunVlLgmZ2bAW11dimpIWMnYlLxmwETVt8K6n36W7P11dgZ8D2v6iOnhh8SWC2x+a67q13X1UkCDZuROpd+Q35973cql8bBmDjcCchu8eDTMtUH5PZJMXBPrSgKTPyPbRZtn9Icq8jk/5P+0p22+KlePi0+i7eI19BNNJT3lHWkBE6crU2Wreg/N5xrPVMMpCd2UkgbysE4WZnYrUc21dPhatdZRzQmrcFdO+6ZJutWqmq56tFt+rS31fHD1qJoBTuqKZFJZF1W6BrSEtZRNzwCtKy//qOrMKwGO19k9S84mR1spqUGwfTf+K/U/WzWOqqFUlvygXP0fVdD3XwglqJPnlTAMpUcJaLXTVaseltovROtU01crmY5asqZe6XXJLYaujdEyNCTaylebOQOIQ8uAvA+uh4U11xdH+wbRTGUInKlK47Cneu3TrcJKMMu51nTOZjp7XpV5pWWAhbI+kXAxtgytqxSnSKqmk6vKFp6WASbDE2CRreffVimdawJV0+k32fUDe1jLUxZrWNRlXFkV+HX9XvPvBsvNp95atxJYnk4P0llPnQ+7WpDcGFrb3POvGdDDSjaV1mk7ytPLVF+F3EWn17+gs8ewuOqb9wctSRO4H3ZOvxW43cJKdbmSi+gY5bmqd3YNMByTFwRVbwdyU7/OV0+HXZmfqYJrizp98b396Jx8H7Chn3s+yH7jXPY8WKYo+g/X0+kgsAT76H91PWlfdPoFr+3931xPuS2/9rm1rO6fl4R3sowpazcu2Bz618Ce+lBm7RYL2w+wvQc2n7bBYa1p2WVBL7IsSmFlRXV074p40Hm3zSfZQ84f2WQVmgrbdt0snmWv2OpdSw3bZ1WvAriKGHvhdGL9jZAaZQtYvOxYpLJJ8JdEhcueQNltVe8Khh8TVR53Wv5Kjt4gV/cv/fb+VQAAAAAAAAAAAAAAAAAAAAAAAAAAAP6HP28kHNstejd+AAAAAElFTkSuQmCC" alt="Online Pianist Logo" />
        </a>
</body>
</html>
```
![HTML - Hyperlinks 4](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Hyperlinks%204.png)


## HTML - Using Links to Connect Web Pages
- We will learn on how to use links to navigate to different web views.
- So let's us create three different pages to be redirected.
- We will use the Online Pianist **home**, **keyboard** and **contact**.
```html
<html>
<head>
        <title>HTML - Using Links to Connect Webpage</title>

        <style>
                .menu-item{
                        display: inline;
                        padding: 12px 16px;
                        background-color: lightblue;
                }
        </style>
</head>
<body>
      <ul style="list-style-type: none">
        <li class="menu-item"><a href="https://www.onlinepianist.com/" target="_blank">Home</a></li>
        <li class="menu-item"><a href="https://www.onlinepianist.com/virtual-piano" target="_blank">Keyboard</a></li>
        <li class="menu-item"><a href="https://www.onlinepianist.com/contact" target="_blank">Contact</a></li>
      </ul>  
</body>
</html>
```
### Our web page
![HTML - Links 1](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Links%201.png)
### Home
![HTML - Links 2](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Links%202.png)
### Keyboard
![HTML - Links 3](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Links%203.png)
### Contact
![HTML - Links 4](https://github.com/IdzhansKhairi/Programming_Notes/blob/main/HTML_Language/Media/Notes%20Pic/HTML%20Links%204.png)


HTML - Uniquely Identify HTML Elements by Using ID Attribute










