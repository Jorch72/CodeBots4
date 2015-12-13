package codebots.bot;

import codebots.gameobjects.*;

public final class ReadonlyBot {
    private final Bot bot;
    public ReadonlyBot(Bot bot){
        this.bot = bot;
    }

    public ReadonlyAddressBook getAddressBook(){
        return new ReadonlyAddressBook(bot.getAddressBook());
    }

    public ReadonlyLog getLog(){
        return new ReadonlyLog(bot.getLog());
    }

    public ReadonlyVariables getVariables(){
        return new ReadonlyVariables(bot.getVariables());
    }

    public boolean functionsMatch(Bot bot, FunctionType type){
        return this.bot.functionsMatch(bot, type);
    }

    public IPAddress getIPAddress(){
        return bot.getSelfIPAddress();
    }
}
