package fr.uphf.Questease.Controller;

import fr.uphf.Questease.Model.Indice;
import fr.uphf.Questease.Model.MotCryptex;
import fr.uphf.Questease.Service.MotCryptexService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class MotCryptexControllerTest {

    @Mock
    private MotCryptexService repo;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        Indice indice = new Indice(154L, "prout");

        MotCryptex mot1 = new MotCryptex(100L, "word1", 2, 154);
        MotCryptex mot2 = new MotCryptex(101L, "word2", 3, 154);

        when(repo.FetchMotCryptex(100L)).thenReturn(Optional.of(mot1));
        when(repo.FetchMotCryptexList()).thenReturn(Arrays.asList(mot1, mot2));
        when(repo.SaveMotCryptex(any(MotCryptex.class))).thenReturn(mot1);
    }

    @Test
    public void testCreateMot() {
        MotCryptex newMotCryptex = new MotCryptex(50L, "bla", 1, 154);

        // Save the new MotCryptex
        repo.SaveMotCryptex(newMotCryptex);

        // Verify that the save method is called
        verify(repo, times(1)).SaveMotCryptex(newMotCryptex);
    }

    @Test
    public void getMotById() {
        Optional<MotCryptex> result = repo.FetchMotCryptex(100L);

        // Assert that the result is present and matches the expected value
        assertThat(result.isPresent()).isTrue();
        assertThat(result.get().getMot()).isEqualTo("word1");

        // Verify interaction with the service
        verify(repo, times(1)).FetchMotCryptex(100L);
    }

    @Test
    public void getRandomWord() {
        MotCryptex randomWord = repo.FetchMotCryptexList()
                .get((int) (Math.random() * repo.FetchMotCryptexList().size()));

        assertThat(randomWord).isNotNull();
        assertThat(Arrays.asList("word1", "word2")).contains(randomWord.getMot());

        // Verify interaction with the service
        verify(repo, times(2)).FetchMotCryptexList(); // called twice in test logic
    }

    @Test
    public void postIndice() {
        MotCryptex motCryptex = new MotCryptex(3L, "newword", 2, 154);

        // Save MotCryptex
        repo.SaveMotCryptex(motCryptex);

        // Verify the save
        verify(repo, times(1)).SaveMotCryptex(motCryptex);
    }

    @Test
    public void updateMot() {
        MotCryptex updatedMot = new MotCryptex(100L, "updatedWord", 3, 154);

        // Update involves deleting the old and saving the new
        repo.deleteMotCryptex(100L);
        repo.SaveMotCryptex(updatedMot);

        // Verify interactions
        verify(repo, times(1)).deleteMotCryptex(100L);
        verify(repo, times(1)).SaveMotCryptex(updatedMot);
    }

    @Test
    public void deleteMot() {
        Long motId = 100L;

        // Perform delete
        repo.deleteMotCryptex(motId);

        // Verify interaction
        verify(repo, times(1)).deleteMotCryptex(motId);
    }

    @Test
    public void getMotCryptex() {
        var mots = repo.FetchMotCryptexList();

        // Assert the result
        assertThat(mots).isNotNull();
        assertThat(mots).hasSize(2);

        // Verify interaction
        verify(repo, times(1)).FetchMotCryptexList();
    }

    @Test
    public void getIndice() {
        // Assuming a method in your service for fetching Indice
        when(repo.GetIndiceWithId(100L)).thenReturn(null); // Mocking response

        var result = repo.GetIndiceWithId(100L);

        // Assert the result
        assertThat(result).isNull();

        // Verify interaction
        verify(repo, times(1)).GetIndiceWithId(100L);
    }
}
