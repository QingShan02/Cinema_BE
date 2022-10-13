class  Service2{
    fillTable = async() =>{
        let {data:result} = await axios.get("/api/ve/getAllVe");
        $$('dashboard2').parse(result);
    }
}
export default new Service2();