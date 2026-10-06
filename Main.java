public class Main {

    public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u) {

        int tamU = 0;

        for (int i = 0; i < tamA; i++) {
            u[tamU] = a[i];
            tamU++;
        }

        for (int i = 0; i < tamB; i++) {

            boolean encontrado = false;

            for (int j = 0; j < tamU; j++) {

                if (b[i] == u[j]) {
                    encontrado = true;
                }
            }

            if (encontrado == false) {
                u[tamU] = b[i];
                tamU++;
            }
        }

        return tamU;
    }


    public static void ordenar(int[] v, int n) {

        for (int i = 1; i < n; i++) {

            int atual = v[i];
            int j = i - 1;

            while (j >= 0 && v[j] > atual) {

                v[j + 1] = v[j];
                j--;
            }

            v[j + 1] = atual;
        }
    }


    public static int gerarVetorSemRepeticao(int[] v, int tamV, int[] vsr) {

        int tamVsr = 0;

        for (int i = 0; i < tamV; i++) {

            boolean encontrado = false;

            for (int j = 0; j < tamVsr; j++) {

                if (v[i] == vsr[j]) {
                    encontrado = true;
                }
            }

            if (encontrado == false) {
                vsr[tamVsr] = v[i];
                tamVsr++;
            }
        }

        return tamVsr;
    }

    public static void rotacionar(int[] v, int tam, int k) {

        if (tam == 0) {
            return;
        }

        k = k % tam;

        if (k < 0) {
            k = k + tam;
        }

        for (int i = 0; i < k; i++) {

            int primeiro = v[0];

            for (int j = 0; j < tam - 1; j++) {
                v[j] = v[j + 1];
            }

            v[tam - 1] = primeiro;
        }
    }
}
