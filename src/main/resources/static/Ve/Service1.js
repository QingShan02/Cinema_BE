class Service1 {
    fillTable = async() => {
        let { data: result } = await axios.get("/api/ve/getAllVe");
        $$('dashboard1').parse(result);
    }
    fillphim = async() => {
        let { data: result } = await axios.get("/api/phim/getAllPhim2");
        const option = result.map(s=>{return {id:s.maPhim,value:s.tenPhim}});
        console.log(option);
        $$('combo1').define("options",option);
       $$('combo1').render();
// return option;
        
    }
    callChart = async(id)=>{
        console.log(id);
        let { data: result }=await axios.get("/api/ve/getAllVe",{params:{maPhim:id}});
        $$('dashboard1').parse(result);
    }
}

export default new Service1();