/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesConcretas;

import ClasesProducto.Quieto;

/**
 *
 * @author (╯°□°)╯︵ ┻━┻
 */
public class AccionMagaQuieto extends Quieto {

    @Override
    public String quieto() {
        System.out.println("Maga esta quieta"
                + " ");
        return "MagaQuieto";
    }

  

}
