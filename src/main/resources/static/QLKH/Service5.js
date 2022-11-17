class Service5{
        fillTableKH = async() =>{
            let {data:result} = await axios.get("/api/kh/getAllKH");
            $$('formKH').clear();
            $$('bangKH').clearAll();
            $$('bangKH').parse(result);
        }

}
export default new Service5();
