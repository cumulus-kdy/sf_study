$(document).ready(function() {
	load_qCountChart();
	load_pHAcdChart();
});

function load_qCountChart() {
	$.ajax({
		type: "POST",
		url: "/restqCount",
		success: function(args) {
			var qCountList = [];
			for (var i = 0; i < args.length; i++) {
				qCountList.push({
					name: "Quality " + args[i].quality,
					y: args[i].count,
					drilldown: "Quality " + args[i].quality
				});
			}
			Highcharts.chart('container1', {
				chart: {
					type: 'column'
				},
				title: {
					text: 'Count of Quality Value'
				},
				accessibility: {
					announceNewData: {
						enabled: true
					}
				},
				xAxis: {
					title: {
						text: 'Value'
					},
					type: 'category'
				},
				yAxis: {
					title: {
						text: 'Count'
					}

				},
				legend: {
					enabled: false
				},
				plotOptions: {
					series: {
						borderWidth: 0,
						dataLabels: {
							enabled: true,
							format: '{point.y:.f}'
						}
					}
				},
				tooltip: {
					headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
					pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.f}</b><br/>'
				},
				series: [
					{
						name: "Count",
						colorByPoint: true,
						data: qCountList
					}
				]
			});
			console.log(qCountList);
		},
		error: function(e) {
			alert(e.responseText);
		}
	});
}

function load_pHAcdChart() {
	$.ajax({
		type: "POST",
		url: "/restpHAcd",
		success: function(args) {
			var pHAcdList = new Array(args.length);
			for (var i = 0; i < args.length; i++) {
				pHAcdList[i] = [args[i].ph, args[i].fixed_acidity];				
			}
			Highcharts.chart('container2', {
				chart: {
					type: 'scatter',
					zoomType: 'xy'
				},
				title: {
					text: 'Correlation between pH and Fixed Acidity'
				},
				xAxis: {
					title: {
						enabled: true,
						text: 'pH'
					},
					startOnTick: true,
					endOnTick: true,
					showLastLabel: true
				},
				yAxis: {
					title: {
						text: 'Fixed Acidity'
					}
				},
				legend: {
					enabled: false
				},
				plotOptions: {
					scatter: {
						marker: {
							radius: 5,
							states: {
								hover: {
									enabled: true,
									lineColor: 'rgb(100,100,100)'
								}
							}
						},
						states: {
							hover: {
								marker: {
									enabled: false
								}
							}
						},
						tooltip: {
							headerFormat: '<b>{series.name}</b><br>',
							pointFormat: 'pH : {point.x}<br>fixed_acidity : {point.y}'
						}
					}
				},
				series: [{
					name: 'pH-Acidity',
					color: 'rgba(223, 83, 83, .5)',
					data: pHAcdList 
				}]
			});
		},
		error: function(e) {
			alert(e.responseText);
		}
	});



}