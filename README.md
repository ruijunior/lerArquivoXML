# Ler Arquivo XML
- Projeto criado utilizando a tecnologia JAX-B;
- Ao executar a aplicação, o método init (anotado com @PostConstruct), efetua a leitura do arquivo XML e grava os dados na banco de dados H2;
- Feito isso, efetue a chamada /dados para exibir os dados gravados;

```json
 {
    "id": 1,
    "segmentoControle": {
      "id": 1,
      "identificadorEmissor": "99999999",
      "identifcadorDestinatario": "12345678",
      "grupoSequencia": {
        "id": 1,
        "numeroSequencia": 1,
        "indicadorContinuacao": "N"
      },
      "dominioSistema": "SPB01",
      "numeroUnicoOperacao": "12345678912345678912345"
    },
    "segmentoSistema": {
      "id": 1,
      "liquidacaoFinanceiraMultilateral": {
        "id": 1,
        "codigoMensagem": "SLC0001",
        "numeroControleSLC": "12345678912345678912",
        "iSPBIF": "12345678",
        "tipoInformacao": "P",
        "grupoLiquidacao": {
          "id": 1,
          "dataLiquidacao": "2019-01-01T00:00:00.000+0000",
          "numeroSequencialCicloLiquidacao": 1,
          "gruposProdutos": [
            {
              "id": 1,
              "codigoProduto": "ACC",
              "grupoLiquidacaoProduto": {
                "id": 1,
                "identificadorLinhaBilateral": "12345678ACC3456789",
                "cnpjNaoLiquidanteDebitado": "99929009000149",
                "iSPBIFDebitada": "99999999",
                "nomeClienteDebitado": "JET",
                "tipoTransacaoSLC": "02",
                "valorLancamento": 4000.00,
                "cnpjNaoLiquidanteCreditado": "17061147000194",
                "tipoDebitoCredito": "D",
                "iSPBIFCreditada": "99999999",
                "nomeClienteCreditado": "BANCO"
              }
            },
            {
              "id": 2,
              "codigoProduto": "VCC",
              "grupoLiquidacaoProduto": {
                "id": 2,
                "identificadorLinhaBilateral": "10045678VCC3456789",
                "cnpjNaoLiquidanteDebitado": "50276286000100",
                "iSPBIFDebitada": "99999999",
                "nomeClienteDebitado": "TRIANGULO",
                "tipoTransacaoSLC": "02",
                "valorLancamento": 3171.76,
                "cnpjNaoLiquidanteCreditado": "23333472000161",
                "tipoDebitoCredito": "C",
                "iSPBIFCreditada": "99999999",
                "nomeClienteCreditado": "BANCO"
              }
            },
            {
              "id": 3,
              "codigoProduto": "MCC",
              "grupoLiquidacaoProduto": {
                "id": 3,
                "identificadorLinhaBilateral": "12345678MCC1633000",
                "cnpjNaoLiquidanteDebitado": "93052785000127",
                "iSPBIFDebitada": "99999999",
                "nomeClienteDebitado": "TRIANGULOBOB",
                "tipoTransacaoSLC": "02",
                "valorLancamento": 5462.12,
                "cnpjNaoLiquidanteCreditado": "07284171000139",
                "tipoDebitoCredito": "C",
                "iSPBIFCreditada": "99999999",
                "nomeClienteCreditado": "BANCO"
              }
            },
            {
              "id": 4,
              "codigoProduto": "CBC",
              "grupoLiquidacaoProduto": {
                "id": 4,
                "identificadorLinhaBilateral": "12345678CBC1633012",
                "cnpjNaoLiquidanteDebitado": "74816392000106",
                "iSPBIFDebitada": "99999999",
                "nomeClienteDebitado": "BANCOBOB",
                "tipoTransacaoSLC": "02",
                "valorLancamento": 21446.69,
                "cnpjNaoLiquidanteCreditado": "30101382000100",
                "tipoDebitoCredito": "C",
                "iSPBIFCreditada": "99999999",
                "nomeClienteCreditado": "TRIANGULOBANCO"
              }
            }
          ]
        },
        "dataMovimento": "2019-01-01T00:00:00.000+0000",
        "dataHoraSLC": "2019-01-01T08:40:21.000+0000"
      }
    }
  }
```