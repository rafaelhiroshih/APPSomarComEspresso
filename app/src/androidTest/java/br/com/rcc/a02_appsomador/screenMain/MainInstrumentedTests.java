package br.com.rcc.a02_appsomador.screenMain;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import br.com.rcc.a02_appsomador.MainActivity;
import br.com.rcc.a02_appsomador.common.ScreenRobot;
import br.com.rcc.a02_appsomador.screenMain.robots.MainRobot;

import static br.com.rcc.a02_appsomador.screenMain.constants.MainConstants.MAIN_APP_BAR;

/**
 * Created by rafael.hiroshi on 04/08/2018.
 */
@RunWith(AndroidJUnit4.class)
public class MainInstrumentedTests extends MainRobot{

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void VerificarElementos() throws InterruptedException {
        new MainRobot()
                .verificarPrimeiroElemento()
                .verificarSegundoElemento()
                .verificarTerceiroElemento()
                .verificarQuartoElemento()
                .verificarQuintoElemento()
                .verificarSextoElemento()
                .verificarSetimoElemento();
    }

    @Test
    public void VerificarTextosNaTela() {
        new MainRobot()

                .verificarTextoDaTela1()
                .verificarTextoDaTela2()
                .verificarTextoDaTela3()
                .verificarTextoDaTela4()
                .verificarTextoDaTela5();

    }

    @Test
    public void VerificarResultadoDaSoma() throws InterruptedException {

        new MainRobot()
                .digitarNumero1()
                .digitarNumero2()
                .clicarEmSomar()
                .verificarTxtPopup()
                .pressBack()
                .verificarOResultado();
    }



}
