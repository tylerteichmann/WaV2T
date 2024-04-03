CSC230 Assignment – Week 3
1. Complete following exercises from the textbook:
EXERCISE 12-5. Using selectors
EXERCISE 12-6. Finishing touches
EXERCISE 13-1. Adding color to a document
EXERCISE 13-2. Adding a tiling background image
EXERCISE 13-3. Controlling tile direction
EXERCISE 13-4. Positioning background images
EXERCISE 13-5. Fixed position (submission not required)
EXERCISE 13-7. Multiple background images
EXERCISE 13-8. Making an external style sheet

2. 
	a) Construct a sample HTML/CSS file using the following document structure.
	b) Write the selector as efficiently as possible.
		1) h2 elements in the “intro” section
		2) strong elements in the “main” section
		3) all the elements belong to the “special” class

	Extra credit: all the elements in the body but not including special class (hint: the :not negation pseudo class).

3. Fill all the selector names in the CSS/HTML file below. 
<!DOCTYPE html>
<html>
<head>
<title> CSS Selectors </title>
<style> 
	/* 1)_______ Selector */
	* { 
		font-size: large; padding: 3px; 
	} 

	/* 2)_______ Selector */
	div { 
		border:2px solid rgb(0, 102, 0); 
	}

	/* 3)_______ Selector */
	.divK p { 
		color: red; 
		font-weight: bold; 
	}

	/* 4)_______ Selector */
	.divK > p { 
		background-color: lightgray; 
	}

	/* 5)_______ Selector */
	.divK + p { 
		font-family: 'Times New Roman'; 
		font-size: larger; 
		font-weight: bold; 
	}

	/* 6)_______ Selector */
	.divK ~ p { 
		border:1px solid red; 
	}

	/* 7)_______ Selector */
	.divK { 
		margin-left: 50px; 
	}
	.divGC { 
		margin-left: 100px; 
	}

</style>
</head>
<body>

	<div >
		<p>P1 </p>
		<p>P2 </p>

			<div class="divK">
				<p>C1 </p>
				<p>C2 </p>
				<p>C3 </p>

				<div class="divGC" >
					<p>G1 </p>
					<p>G2</p>
				</div>

				<p>C4 </p>
			</div>
		
		<p>P3</p>
		<p>P4</p>
		<p>P5</p>
	</div>

</body>
</html>