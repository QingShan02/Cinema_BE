import Service1 from './Service1.js';
let a=0;
const ve = () => ({
    view: "scrollview",
    id: 've',
    scroll: "y",
    body: {
        rows: [{
			cols:[{
            view: "select",
            id: "combo1",
            inputWidth: 200,
            options: [],
            select:0,
            on: {
                onChange: function (s) {
                    Service1.callChart(s);
                }
            }
       },{
		   view: "combo",
            id: "combo",
            inputWidth: 200,
            options: {
				data:[
  { id:1, value:"1"},
  { id:2, value:"2"},
  { id:3, value:"3"},
  { id:4, value:"4"},
  { id:5, value:"5"},
  { id:6, value:"6"},
  { id:7, value:"7"},
  { id:8, value:"8"},
  { id:9, value:"9"},
  { id:10, value:"10"},
  { id:11, value:"11"},
  { id:12, value:"12"}
]
			},
			on: {
                onChange: function (s) {
					console.log(s);
					a=s;
					console.log(a);
                }
            }
	   }] 
	   }, 
	   {
            id: 'dashboard1',
            view: "chart",
            type: "stackedBar",
            value: "#soluong#",
            preset: "alpha",
            height: 400,
            tooltip: {
                template: "Ngày <span class='title'>#ngay#</span><br/>số vé <span class='title'>#soluong#</span>"
            },
            xAxis: {
                template: function (obj) {
                   return  webix.Date.dateToStr("%d")(obj.$unit)
                    // return obj.$unit.getDate() == 15 ? webix.Date.dateToStr("%M")(obj.$unit) : ""
                },
                lineColor: function (obj) {
                    //  && (obj.$unit.valueOf() == (new Date(2019, 1, 1)).valueOf())
                    return (obj.$unit) ? "#737373" : "#cfcfcf"
                },
                value: function (obj) {
                    return webix.Date.strToDate("%Y.%m.%d")(obj.ngay);
                },
                units: {
                    start: new Date(2022, a, 1),
                    end: new Date(2022, a, 30),
                    next: function (d) {
                        return webix.Date.add(d, 1, "day", true);
                    }
                }
            },
            yAxis: {
                start: 0,
                step: 10,
                end: 100
            },
            data: [

            ]
        }]
    }
})

export default ve();