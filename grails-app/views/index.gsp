<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Welcome to RelEnv</title>
		<style type="text/css" media="screen">
			#status {
				background-color: #eee;
				border: .2em solid #fff;
				margin: 2em 2em 1em;
				padding: 1em;
				width: 12em;
				float: left;
				-moz-box-shadow: 0px 0px 1.25em #ccc;
				-webkit-box-shadow: 0px 0px 1.25em #ccc;
				box-shadow: 0px 0px 1.25em #ccc;
				-moz-border-radius: 0.6em;
				-webkit-border-radius: 0.6em;
				border-radius: 0.6em;
			}

			.ie6 #status {
				display: inline; /* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */
			}

			#status ul {
				font-size: 0.9em;
				list-style-type: none;
				margin-bottom: 0.6em;
				padding: 0;
			}

			#status li {
				line-height: 1.3;
			}

			#status h1 {
				font: bold 65px/60px Helvetica, Arial, Sans-serif; 
				text-align: center; 
				color: #eee; 
				text-shadow: 0px 2px 6px #333; 
			}

			#page-body {
			
			}

			h2 {
				margin-top: 1em;
				margin-bottom: 0.3em;
				font-size: 1em;
			}

			p {
				line-height: 1.5;				
			}

			#controller-list ul {
				list-style-position: inside;
			}

			#controller-list li {
				line-height: 1.3;
				list-style-position: inside;
				margin: 0.25em 0;
			}

			@media screen and (max-width: 480px) {
				#status {
					display: none;
				}

				#page-body {
					margin: 0 1em 1em;
				}

				#page-body h1 {
					margin-top: 0;
				}
			}
		</style>
		<link rel="stylesheet" type="text/css" href="css/style.css"/>
	</head>
	<body>
			
		<div id="page-body" role="main">
			<h1>Welcome to the LV= Environment and Release management tool</h1>
			<p>The purpose of this tool is to offer a central location for tracking environments and the releases currently deployed to those environments.</p>                               

						
			<ul id="movieposters">
			<li>
				<img src="images/01_iron_man_2.jpg" alt="Iron Man 2" />
				<div class="movieinfo">
					<h3>Release</h3>
					<p>List view of all currently available Release</p>
					<g:link action="index" controller="release" >Calendar</g:link>
				</div>
			</li>
			<li>
				<img src="images/02_the_last_airbender.jpg" alt="The Last Airbender" />
				<div class="movieinfo">
					<h3>Version</h3>
					<p>List view of all current available versions</p>
					<g:link action="index" controller="version" >Version</g:link>
				</div>
			</li>
			<li>
				<img src="images/03_tron_legacy.jpg" alt="Tron Legacy" />
				<div class="movieinfo">
					<h3>Calendar</h3>
					<p>Check the timelines of a planned project, and check for conflicts</p>
					<g:link action="index" controller="event" >Calendar</g:link>
				</div>
			</li>
		</ul>
			
		</div>
	</body>
</html>
