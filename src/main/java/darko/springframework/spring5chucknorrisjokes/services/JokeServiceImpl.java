package darko.springframework.spring5chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    //vrsimo dipendency injection preko Constructora
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        //hard codiramo bean za sada:
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
