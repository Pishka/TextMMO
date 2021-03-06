package ru.alastar.main.handlers;

import ru.alastar.main.net.Server;
import ru.alastar.main.net.ConnectedClient;

public class CastHandler extends Handler
{
    public CastHandler()
    {
        this.numOfArgs = 2;
        this.description = "Cast spell at entity with given id";
    }

    @Override
    public void execute(String[] args, ConnectedClient c)
    {
        try
        {
            if ((args.length - 1) == numOfArgs)
            {
                Server.HandleCast(args[1], Integer.parseInt(args[2]), c);
            }
        } catch (Exception e)
        {
            Server.handleError(e);
        }
    }

}
