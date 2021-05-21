<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>drug cases</title>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>

<script type="text/javascript">
	$(document).ready(function() {

		$.ajax({
			type : 'GET',
			headers : {
				Accept : "application/json; charset=utf-8",
				"Content-Type" : "application/json; charset=utf-8"
			},
			url : '${pageContext.request.contextPath}/taskc/findall',
			success : function(result) {
				google.charts.load('current', {
					'packages' : [ 'corechart' ]
				});
				google.charts.setOnLoadCallback(function() {
					drawChart(result);
				});
			}
		});

		function drawChart(result) {

			var data = new google.visualization.DataTable();
			data.addColumn('string', 'date');
			data.addColumn('number', 'report');

			var dataArray = [];
			$.each(result, function(i, obj) {
				dataArray.push([obj.date , obj.report ]);
			});

			data.addRows(dataArray);
			var linechart_options = {
				title : 'Dhaka Tribune: Drug Cases Events V/S Reports Submitted By Histogram',
				width : 1920,
				height : 900,
				legend :'none'
			};
			var linechart = new google.visualization.Histogram(document
					.getElementById('linechart_div'));
			linechart.draw(data, linechart_options);
		}

	});
</script>

</head>
<body>

	<table class="columns">
		<tr>
			<td><div id="linechart_div" style="border: 1px solid #ccc"></div></td>
		</tr>
	</table>

</body>
</html>