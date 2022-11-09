class  Service2{
    fillTable = async() =>{
        let {data:result} = await axios.get("/api/ve/getAllVe");
        $$('dashboard2').parse(result);
    }
    fillphim = async() => {
        let { data: result } = await axios.get("/api/phim/getAllPhim2");
        const option = result.map(s=>{return {id:s.maPhim,value:s.tenPhim}});
        console.log(option);
        $$('combo2').define("options",option);
       $$('combo2').render();
// return option;
        
    }
    callChart = async(id)=>{
        console.log(id);
        let { data: result }=await axios.get("/api/ve/getAllVe",{params:{maPhim:id}});
        $$('dashboard2').parse(result);
    }
}
export default new Service2();