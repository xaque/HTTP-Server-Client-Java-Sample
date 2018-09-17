package server;

import shared.Results;

public class ParseDoubleHandler extends HandlerBase{
    public ParseDoubleHandler(){}

    @Override
    public Results runCommand(Object obj) {
        Results r;
        try{
            Double d = StringProcessor.getInstance().parseDouble((String) obj);
            r = new Results(true, d, "");
        }
        catch (NumberFormatException e){
            r = new Results(false, null, e.getMessage());
        }
        return r;
    }
}
