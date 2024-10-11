package PJBL;

import java.util.List;

public interface VerificadorAdapter {
    boolean verificar(List<Usuario> usuarios, String identificador);
}
