package guru.springframework.spring5jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public String getQuote() {
        return quotes.getRandomQuote();
    }
}
