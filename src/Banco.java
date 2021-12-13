import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Banco {

    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;

}
